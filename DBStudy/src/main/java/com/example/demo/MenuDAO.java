package com.example.demo;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuDAO {
	int insert(String m_name,int m_price);
	ArrayList<MenuDTO> select();
	int delete(int delNum);
	int update (int menu_no, String name, int price);
}
