package com.green.nowon.service.impl;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.green.nowon.domain.entity.BoardEntityRepository;
import com.green.nowon.service.BoardService;

import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Pageable;

//Buisiness 로직계층
@RequiredArgsConstructor
@Service
public class BoardServiceProcess implements BoardService {

//BoardEntityRepository 접근하는 인터페이스
	private final BoardEntityRepository repository;

	@Override
	public void findAllProcess(Model model) {
		//페이징처리
		/*
		Sort sort = Sort.by(Direction.DESC, "no");
		Pageable pageable = PageRequest.of(5428, 10, sort);
		//Boardentity가 매핑되어서 찾아준다 findAll()은 JPA제공 메서드
		model.addAttribute("list", repository.findAll(pageable));
		*/
		int limit=10;
		int offset=5428;
		model.addAttribute("list", repository.selectAllWithPagination(limit,offset));
			
	}
	
}
