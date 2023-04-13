package com.human.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.human.service.CustomOAuth2UserService;

@Configuration			// 스프링 설정하는 빈으로 등록
@EnableWebSecurity		// 스프링 시큐리티 기능을 해당 클래스에 활성화
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private CustomOAuth2UserService customOAuth2UserService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// OAuth2 로그인 기능 활성화
		http.oauth2Login()
			.loginPage("/login")
			.userInfoEndpoint()						// OAuth2 로그인 설공후 사용자 정보 설정
			.userService(customOAuth2UserService)	// 로그인 성공 후 처리할 서비스 설정
			;
		
	}

	
	
	
	
}
