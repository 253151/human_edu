package com.human.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.human.domain.Reply;

@Mapper
public interface ReplyMapper {
	
	// 댓글 전체 조회
	public List<Reply> list() throws Exception;
	
	// 댓글 목록 - 게시글 번호
	public List<Reply> listByBoardNo(int boardNo) throws Exception;
	
	// 댓글 등록
	public int insert(Reply reply) throws Exception;
		
	// 댓글 수정
	public int update(Reply reply) throws Exception;
	
	// 댓글 삭제
	public int delete(int replyNo) throws Exception;

	// [최댓값] 댓글번호
	public int maxReplyNo() throws Exception;
}
