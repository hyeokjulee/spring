package com.carshop.controller;

import org.springframework.web.multipart.MultipartFile;

public class CarDTO {
	private String cid, cname, cprice, ccate, cdesc;
	private MultipartFile carimage;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCprice() {
		return cprice;
	}

	public void setCprice(String cprice) {
		this.cprice = cprice;
	}

	public String getCcate() {
		return ccate;
	}

	public void setCcate(String ccate) {
		this.ccate = ccate;
	}

	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}
	
	public MultipartFile getCarimage() {
		return carimage;
	}

	public void setCarimage(MultipartFile carimage) {
		this.carimage = carimage;
	}

	public CarDTO(String cid, String cname, String cprice, String ccate, String cdesc) {
		this.cid = cid;
		this.cname = cname;
		this.cprice = cprice;
		this.ccate = ccate;
		this.cdesc = cdesc;
	}

	public CarDTO() {
	}
}
