package com.green.nowon;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.green.nowon.domain.entity.BoardEntity;
import com.green.nowon.domain.entity.BoardEntityRepository;

@SpringBootTest
class Web240610JpaConfigApplicationTests {
	
	
	@Autowired
	BoardEntityRepository rep;
	
	
	@Test
	void board_dummy() {
		IntStream.rangeClosed(1,100).forEach(i->{
			//BoardEntity entity2 = new BoardEntity(i,null,null,i);
			BoardEntity entity =BoardEntity.builder()
					.title("제목" + i)
					.content("내용"+i)
					.build();
			
			rep.save(entity);
		});
	}

}
