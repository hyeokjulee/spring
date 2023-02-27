package com.carshop.controller;

public class BoardDTO {
	private String btitle, bcontent, bauthor, date;

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public BoardDTO(String btitle, String bcontent, String bauthor, String date) {
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bauthor = bauthor;
		this.date = date;
	}

	public BoardDTO() {
	}
}
