package com.javalec.spring_mybatis.dto;

public class ContentDto {

	private int bbsID;
	private String bbsTitle;
	private String bbsContent;
	private String userID;
	private String bbsDate;
	private int bbsAvailable;

	public ContentDto() {
		// TODO Auto-generated constructor stub
	}
	/*
	public ContentDto(int bbsID, String bbsTitle, String bbsContent) {
		this.bbsID = bbsID;
		this.bbsTitle = bbsTitle;
		this.bbsContent = bbsContent;
	}
	*/

	public int getBbsID() {
		return bbsID;
	}

	public void setBbsID(int bbsID) {
		this.bbsID = bbsID;
	}

	public String getBbsTitle() {
		return bbsTitle;
	}

	public void setBbsTitle(String bbsTitle) {
		this.bbsTitle = bbsTitle;
	}

	public String getBbsContent() {
		return bbsContent;
	}

	public void setBbsContent(String bbsContent) {
		this.bbsContent = bbsContent;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getBbsDate() {
		return bbsDate;
	}

	public void setBbsDate(String bbsDate) {
		this.bbsDate = bbsDate;
	}

	public int getBbsAvailable() {
		return bbsAvailable;
	}

	public void setBbsAvailable(int bbsAvailable) {
		this.bbsAvailable = bbsAvailable;
	}
}
