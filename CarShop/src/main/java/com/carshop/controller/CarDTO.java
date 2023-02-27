package com.carshop.controller;

public class CarDTO {
	private String cid, cname, cprice, ccate, cdesc;

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
