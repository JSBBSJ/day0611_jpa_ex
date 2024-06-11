package com.green.nowon.domain.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
//jpa-ORM기술표준 : DB의 테이블과 java의 객체가 매핑
//jpa에서는 데이터처리를 DB-테이블의 사용하지 않고 
//java의 Entity를 이용하여 처리한다.
import lombok.NoArgsConstructor;

//시퀀스-생성시켜주는 기능

@SequenceGenerator(name = "gen_board",
		sequenceName = "seq_board",initialValue = 1, allocationSize = 1)
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@Entity//테이블이라고 생각합시다. -중요하기 때문에 DTO 사용하지 마세요
@Table(name = "board")//별도로 지정하지 않으면 클래스 이름이 테이블명
public class BoardEntity extends BaseEntity {
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)//auto_increment
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_board")
	@Id//pk컬럼입니다.
	private long no;
	
	@Column(nullable = false)//not null
	private String title;//게시글 제목 -필수
	@Column(columnDefinition = "text not null")//not null
	private String content;//내용 -필수
	private int readCount;//db에서 자동으로 underscore 표기법으로 적용됨
	
	
	
}
