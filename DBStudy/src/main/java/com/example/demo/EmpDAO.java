package com.example.demo;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpDAO {
	ArrayList<EmpDTO> getEmpList();
	ArrayList<EmpDTO> view(int low,int hi); // DTO에 id=view가 호출됨
	ArrayList<DepDTO> getDepList();
}

