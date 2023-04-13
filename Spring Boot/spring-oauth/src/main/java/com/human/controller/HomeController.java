package com.human.controller;


import java.util.Map;

import javax.servlet.http.Cookie;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(@AuthenticationPrincipal OAuth2User principal
					   ,Model model) {
		
		if( principal != null ) {
			Map<String, Object> map = principal.getAttributes();
			log.info("map : " + map);
			log.info("map : " + map.get("properties"));
			
			Map<String, Object> proMap = (Map<String, Object>) map.get("properties");
			Map<String, Object> accountMap = (Map<String, Object>) map.get("kakao_account");
			
			String profile_image = String.valueOf( proMap.get("profile_image") );
			String thumbnail_image = String.valueOf( proMap.get("thumbnail_image") );
			
			String email = String.valueOf( accountMap.get("email") );
			
			
			log.info("map : " + proMap);
			log.info("email : " + email);
			log.info("profile_image : " + proMap.get("profile_image"));
			
			model.addAttribute("email", email);
			model.addAttribute("profile_image", profile_image);
			model.addAttribute("thumbnail_image", thumbnail_image);
		}
		
		
		return "/index";
	}
	
	
	// 로그인
	@GetMapping("/login")
	public String login(Model model
					   ,@CookieValue(value = "remember-id", required = false) Cookie cookie ) {
		
		boolean rememberId = false;		// 아이디 저장 체크 여부
		String userId = "";
		
		// log.info("쿠키 : " + cookie.toString());
		
		if( cookie != null ) {
			userId = cookie.getValue();
			rememberId = true;
		}
		
		model.addAttribute("userId", userId);
		model.addAttribute("rememberId", rememberId);
		
		return "/login";
	}
	
	

}




