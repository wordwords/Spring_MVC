package com.javalec.spring_mybatis.dao;

import java.util.ArrayList;

import com.javalec.spring_mybatis.dto.ContentDto;

public interface IDao {
	
	public ArrayList<ContentDto> listDao();
	public void writeDao(String bbsTitle, String bbsContent);
	//public ContentDto viewDao(String bbsID);
	public void deleteDao(String bbsID);
}