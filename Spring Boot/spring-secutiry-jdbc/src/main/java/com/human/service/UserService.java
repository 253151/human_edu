package com.human.service;

import javax.servlet.http.HttpServletRequest;

import com.human.domain.UserAuth;
import com.human.domain.Users;

public interface UserService {

	// 회원가입
	public int join(Users user) throws Exception;
	
	// 권한등록
	public int insertAuth(UserAuth userAuth) throws Exception;

	// 회원조회
	public Users select(Users user) throws Exception;
	
	// 토큰 인증 (가입 후 바로 로그인)
	public boolean tokenAuthentication(Users user, HttpServletRequest request) throws Exception;
	
}
