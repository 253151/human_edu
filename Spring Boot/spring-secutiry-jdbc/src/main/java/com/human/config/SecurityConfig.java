package com.human.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import com.human.security.CustomAccessDeniedHandler;
import com.human.security.CustomLoginSuccessHandler;

@Configuration			// 이 클래스를 스프링 설정 빈으로 등록
@EnableWebSecurity		// 이 클래스에 스프링 시큐리티 기능 활성화
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// WebSecurityConfigurerAdapter : 시큐리티 설정을 적용하는 클래스
	// - cofigure(HttpSercurity) 메소드를 재정의하여 설정을 할 수 있다
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// 인증 : 아이디/비밀번호 로 가입된 사용자 인지 입증
		// 인가 : 사용자에 대한 권한을 부여하는 것
		
		// 인가
		// authrizeRequests()		: URL 요청에 대한 접근권한 설정
		// antMatchers()			: 경로 지정
		// permitAll()				: 모든 사용자에 접근 허용
		// hasRole(), hasAnyRole()	: 특정 권한을 가진 사용자만 허용
		// * 문자열 형태로 Role 을 지정 --> "ROLE_" 접두사가 자동으로 붙는다
		// ex) USER  -->  ROLE_USER
		http.authorizeRequests()
//			.antMatchers("/*").permitAll()
			.antMatchers("/logout").permitAll()
			.antMatchers("/join").permitAll()
			.antMatchers("/user/**").hasAnyRole("USER", "ADMIN") 	// 사용자/관리자 접근 허용
			.antMatchers("/user/check/id").permitAll()
			.antMatchers("/admin/**").hasRole("ADMIN") 				// 관리자만 접근 허용
//			.anyRequest().authenticated()							// 그외의 요청은 인증된 사용자만
			;
		
		// 인증
		// 폼 로그인 설정
		http.formLogin()
			.loginPage("/login")		// 로그인 페이지 URL 지정
			.usernameParameter("id")	// 로그인 폼 요청 아이디 파라미터명 지정 (default : username)
			.passwordParameter("pw")	// 로그인 폼 요청 패스워드 파라미터명 지정 (default : password)
			.defaultSuccessUrl("/")  	// 로그인 성공 시, 이동할 경로
			.successHandler(authenticationSuccessHandler())
			.permitAll()
			;
		
		// 로그아웃 설정
		http.logout()
			.logoutUrl("/logout")		// 로그아웃 처리 URL 지정 (default : "/logout")
			.logoutSuccessUrl("/") 		// 로그아웃 성공 시, 이동할 경로 (default : "/login")
			.permitAll()
			;	
		
		
		// 자동 로그인
		// - 한 번 로그인 하면, 브라우저 종료 후 다시 접속하여도 아이디/비밀번호 입력없이 자동으로 로그인 하는 기능
		// - DB에 retsistnet_logins (자동 로그인 테이블)을 정의해야한다.
		// - remember-me 라는 요청 피라미터를 포함하여 요청을 보내야한다.
		http.rememberMe()
			.key("human")
			.tokenRepository(tokenRepository())	// DataSource가 등록된 토큰 저장정보를 등록
			.tokenValiditySeconds(60*60*24) 	//토큰 유효기간 (단위 : 초)
			;
		
		// csrf 설정
//		http.csrf()
//			.disable()		// csrf 보안 설정 비활성화
//			;
		// 예외 처리 설정
		// - 접근 거부 페이지 등록
		// - 접근 거부 처리자 등록
		http.exceptionHandling()
//			.accessDeniedPage("/error/403")
			.accessDeniedHandler(createAccessDeniedHandler())
			;
		
	}

	// JDBC 인증 방식
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		String sql1 = " SELECT user_id AS username "
					+ " 	  ,user_pw AS password "
					+ "       ,enabled "
					+ " FROM users "
					+ " WHERE user_id = ? "
					;
		
		String sql2 = " SELECT user_id AS username "
					+ " 	  ,auth AS authority "
					+ " FROM user_auth "
					+ " WHERE user_id = ? "
					;
		 
		auth.jdbcAuthentication()				// JDBC 를 통한 인증방식으로 지정
			.dataSource(dataSource)				// 데이터 소스 지정
			.passwordEncoder(passwordEncoder)	// 암호화 방식 지정
			.usersByUsernameQuery(sql1)			// 아이디/비밀번호/활성화여부 가져올 쿼리 지정
			.authoritiesByUsernameQuery(sql2)	// 권한을 가져올 쿼리 지정
			;
			
	}
	
	// 인증 관리 클래스 - 빈 등록
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	// 인증 성공 클래스 - 빈 등록
	@Bean
	public AuthenticationSuccessHandler authenticationSuccessHandler() {
		return new CustomLoginSuccessHandler();
	}
	
	// 자동로그인을 위한 토큰 정보 객체 생성 메소드
	private PersistentTokenRepository tokenRepository() {
		JdbcTokenRepositoryImpl repositoryImpl = new JdbcTokenRepositoryImpl();
		repositoryImpl.setDataSource(dataSource);
		return repositoryImpl;
	}
	
	// 접근 거부 클래스 - 빈 등록
	@Bean
	public AccessDeniedHandler createAccessDeniedHandler() {
		return new CustomAccessDeniedHandler();
	}
	
	
	
	
	

}


















