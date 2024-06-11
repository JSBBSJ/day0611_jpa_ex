package com.green.nowon.service.impl;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.green.nowon.domain.mapper.BoardMapper;
import com.green.nowon.service.MybatisBoardService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MybatisBoardServiceProcess implements MybatisBoardService{
	
	private final BoardMapper mapper;
	
	@Override
	public void findAll(Model model) {
		
		Sort sort = Sort.by(Direction.DESC, "no");
		Pageable pageable = PageRequest.of(4312, 10, sort);
		model.addAttribute("list", mapper.findAll());
	}

}
