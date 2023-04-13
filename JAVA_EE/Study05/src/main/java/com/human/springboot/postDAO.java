package com.human.springboot;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface postDAO {

	void addWrite(String title, String content, String name);
	
	ArrayList<postDTO> getList();
	
	viewDTO getPost1(int post_id);
	postDTO getPost(int post_id);
	
	void delPost(int post_id);
	
	void update(int post_id, String title, String content);

}
