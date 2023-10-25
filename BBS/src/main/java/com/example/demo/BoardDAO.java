package com.example.demo;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDAO {
	ArrayList<BoardDTO> getlist(int start,int psize);
	BoardDTO view(int seqno);

	void hitup(int seqno);
	void delete(int seqno);
	void insert(String title,String content,String writer);
	void update(int seqno,String title,String content);
	int getTotal();
}
