package com.example.demo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDAO {
	int signup(String id,String pw);
	int login(String id,String pw);
}
