package com.green.nowon.domain.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
	
	private long no;
	private String title;
	private String content;
	private int readCount;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
