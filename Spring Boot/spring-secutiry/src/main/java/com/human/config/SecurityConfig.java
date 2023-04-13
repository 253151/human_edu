package com.human.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration			// 이 클래스를 스프링 설정 빈으로 등록
@EnableWebSecurity		// 이 클래스에 스프링 시큐리티 기능 활성화
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// WebSecurityConfigurerAdapter : 시큐리티 설정을 적용하는 클래스
	// - cofigure(HttpSercurity) 메소드를 재정의하여 설정을 할 수 있다
	
	@Autowired
	private PasswordEncoder passwordEncoder; 
	
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
			.antMatchers("/").permitAll()
			.antMatchers("/join").permitAll()
			.antMatchers("/user/**").hasAnyRole("USER", "ADMIN") 	// 사용자/관리자 접근 허용
			.antMatchers("/admin/**").hasRole("ADMIN") 				// 관리자만 접근 허용
			.anyRequest().authenticated()							// 그외의 요청은 인증된 사용자만
			;
		
		// 로그인 설정
		http.formLogin()
			.defaultSuccessUrl("/")		// 로그인 성공 시, 이동할 경로
			.permitAll();
	}

	// 인 메모리방식 사용자 등록
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// AuthenticationManagerBuilder : 인증 관리자를 생성하는 클래스
		
		// 사용자 등록 
		// - user / 123456 / ROLE_USER
		// - admin / 123456 / ROLE_USER, ROLE_ADMIN
		auth.inMemoryAuthentication()		// 인증방식 : 인메모리 방식으로 지정
			.withUser("user").password( passwordEncoder.encode("123456")).roles("USER")
			.and()
			.withUser("admin").password( passwordEncoder.encode("123456")).roles("USER", "ADMIN")
			;
			
	}	
	
	

}


















