package com.javalec.spring_mybatis.dto;

public class MemberDto {

	private int bbsID;
	private String bbsTitle;
	private String bbsContent;

	public MemberDto() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberDto(int bbsID, String bbsTitle, String bbsContent) {
		this.bbsID = bbsID;
		this.bbsTitle = bbsTitle;
		this.bbsContent = bbsContent;
	}

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
}
