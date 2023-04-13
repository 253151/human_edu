package com.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.domain.Reply;
import com.human.mapper.ReplyMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ReplyServiceImpl implements ReplyService {
	
	@Autowired
	private ReplyMapper replyMapper;

	@Override
	public List<Reply> list() throws Exception {
		List<Reply> replyList = replyMapper.list();
		
		
		for (Reply reply : replyList) {
			log.info(reply.toString());
		}
		
		
		return replyList;
	}

	@Override
	public List<Reply> list(int boardNo) throws Exception {
		List<Reply> replyList = replyMapper.listByBoardNo(boardNo);
		return replyList;
	}

	@Override
	public int insert(Reply reply) throws Exception {
		
		int result = replyMapper.insert(reply);
		
		// 댓글 번호 최댓값
		int replyNo = replyMapper.maxReplyNo();
		reply.setReplyNo(replyNo);
		reply.setGroupNo(replyNo);
		
		result = replyMapper.update(reply);
		
		return result;
	}

	@Override
	public int update(Reply reply) throws Exception {
		int result = replyMapper.update(reply);
		return result;
	}

	@Override
	public int delete(int replyNo) throws Exception {
		int result = replyMapper.delete(replyNo);
		return result;
	}

}







