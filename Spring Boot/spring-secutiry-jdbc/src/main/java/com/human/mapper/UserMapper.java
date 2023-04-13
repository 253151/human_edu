package com.human.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.human.domain.UserAuth;
import com.human.domain.Users;

@Mapper
public interface UserMapper {
	
	// 회원가입
	public int join(Users user) throws Exception;
	
	// 권한등록
	public int insertAuth(UserAuth userAuth) throws Exception;
	
	// 회원조회
	public Users select(Users user) throws Exception;

}
