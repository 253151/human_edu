package com.human.springboot;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface memberDAO {
	void addMember(String loginid, String passcode, String name, String mobile);
	int getMemberCount(String loginid, String passcode);
}
