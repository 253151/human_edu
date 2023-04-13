package com.human.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.human.domain.Users;
import com.human.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// 사용자 페이지
	@GetMapping({"", "/", "/index"})
	public String index() {
		log.info("사용자 페이지...");
		
		return "/user/index";
	}
	
	// ID 중복확인
	@ResponseBody
	@PostMapping("/check/id")
	public ResponseEntity<Boolean> checkUserId(Users user) throws Exception {
		
		Users selectedUser = userService.select(user);
		String userId = user.getUserId();
		
		// ID 중복
		if( selectedUser != null ) {
			log.info("ID 중복... : " + userId);
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}
		
		// ID 중복 아님(사용가능)
		log.info("ID 사용가능 : " + userId);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
 
}


















