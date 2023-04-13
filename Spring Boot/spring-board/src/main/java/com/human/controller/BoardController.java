package com.human.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.human.domain.Board;
import com.human.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	// 게시글 목록
	@GetMapping("/list")
	public String list(Model model, String keyword) throws Exception {
		
		// 게시글 목록 요청
		List<Board> boardList = boardService.list(keyword);
		
//		log.info("boardList: " + boardList);
		
		// 게시글 목록 모델에 등록
		model.addAttribute("boardList", boardList);
		
		return "/board/list";
	}
	
	// 게시글 쓰기 - 화면
	@GetMapping("/insert")
	public String insert() {
		
		return "/board/insert";
	}
	
	// 게시글 쓰기 - 처리
	// 요청파라미터 연결 : @RequestParam("title")| String title
	// * 요청파라미터 이름과 실제 매개변수 이름이 같으면 어노테이션 생략 가능
	@PostMapping("/insert")
	public String insertPro(Board board) throws Exception {
		
		log.info("title : " + board.getTitle());
		log.info("writer : " + board.getWriter());
		log.info("content : " + board.getContent());
		
		// 게시글 쓰기 요청
		int result = boardService.insert(board);
		
		if(result > 0) log.info("게시글 쓰기 설공");
		else log.info("게시글 쓰기 실패");
		
		return "redirect:/board/list";
	}
	
	// 게시글 읽기 - 화면
	@GetMapping("/read")
	public String read(Model model, int boardNo) throws Exception {
		
		Board board = boardService.read(boardNo);
		model.addAttribute("board", board);
		
		return "/board/read";
	}
	
	// 게시글 수정 - 화면
	@GetMapping("/update")
	public String update(Model model, int boardNo) throws Exception {
		
		Board board = boardService.read(boardNo);
		model.addAttribute("board", board);
		
		return "/board/update";
	}
	
	// 게시글 수정 - 처리
	@PostMapping("/update")
	public String updatePro(Board board) throws Exception {
		
		int result = boardService.update(board);
		
		if(result > 0) log.info("게시글 쓰기 설공");
		else log.info("게시글 쓰기 실패");
		
		return "redirect:/board/list";
	}
	
	// 게시글 삭제
	@PostMapping("/delete")
	public String delete(int boardNo) throws Exception {
		
		int result = boardService.delete(boardNo);
		
		if(result > 0) log.info("게시글 삭제 설공");
		else log.info("게시글 쓰기 실패");
		
		return "redirect:/board/list";
	}
	
	
	

}









