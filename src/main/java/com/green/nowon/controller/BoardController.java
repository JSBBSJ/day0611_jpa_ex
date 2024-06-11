package com.green.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.green.nowon.service.BoardService;
import com.green.nowon.service.impl.BoardServiceProcess;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/boards")
public class BoardController {
	
	//서비스	
	private final BoardService service; //생성자 DI - 자동처리됨
	
	//게시글의 내용을 표현해주는 페이지
	@GetMapping// url 생략시 클래스의 기본경로 적용 /boards/ == /boards
	public String list(Model model) {
		
		service.findAllProcess(model);
		
		return "views/board/list";
	}
	
}
