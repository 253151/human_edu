package com.human.service;

import java.util.List;

import com.human.domain.Board;

public interface BoardService {
	
	// 게시글 목록
	public List<Board> list() throws Exception;
	
	// 게시글 쓰기
	public int insert(Board board) throws Exception;
	
	// 게시글 읽기
	public Board read(int boardNo) throws Exception;
	
	// 게시글 수정
	public int update(Board board) throws Exception;
	
	// 게시글 삭제
	public int delete(int boardNo) throws Exception;

	// 검색
	public List<Board> list(String keyword) throws Exception;

}