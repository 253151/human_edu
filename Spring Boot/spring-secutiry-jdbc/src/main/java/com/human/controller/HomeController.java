package com.human.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.human.domain.Users;
import com.human.service.UserService;
import com.human.util.ValidationUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ValidationUtil validationUtil;
	
	// 로그인
	@GetMapping("/login")
	public String login(Model model, @CookieValue(value="remember-id", required = false) Cookie cookie) {
		
		boolean rememberId = false;
		String userId = "";
		
//		log.info(cookie.toString());
		
		if(cookie != null) {
			userId = cookie.getValue();
			rememberId = true;
		}
		
		model.addAttribute("userId", userId);
		model.addAttribute("rememberId", rememberId);
		
		return "/login";
	}
	
	// 회원가입
	@GetMapping("/join")
	public String join(Users user) {
		log.info("회원가입 화면...");
		
		return "/join";
	}
	
	/**
	 * 회원가입 처리
	 * 
	 * * @Validated		: 입력값 검증 기능 활성화
	 * * BindingResult	: 요청 데이터의 바인딩 및 검증 오류 정보
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/join")
	public String joinPro(@Validated Users user, BindingResult bindingResult, HttpServletRequest request) throws Exception {
		
		
		// 유효성 검증 오류확인
		if(validationUtil.joinCheckError(bindingResult, user) ) {
			log.info("유효성 검증 오류...");
			return "/join";
		}
		
		// 회원가입 처리
		int result = userService.join(user);
		
		boolean isAuthentication = false;
		if( result > 0 ) {
			log.info("회원가입 성공...");
			// 바로 로그인
			isAuthentication = userService.tokenAuthentication(user, request);
		} else {
			log.info("회원가입 실패...");
		}
		
		// 인증(바로 로그인) 실패
		if(!isAuthentication) {
			return "redirect:/login";
		}
		
		return "redirect:/";
	}

}












