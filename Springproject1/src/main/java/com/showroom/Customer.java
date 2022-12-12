package com.showroom;

public class Customer {
	private String Cusname;
	private int Cid;
	private Company com;
	public String getCusname() {
		return Cusname;
	}
	public void setCusname(String cusname) {
		Cusname = cusname;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public Company getCom() {
		return com;
	}
	public void setCom(Company com) {
		this.com = com;
	}
	@Override
	public String toString() {
		return "Customer [Cusname=" + Cusname + ", Cid=" + Cid + ", com=" + com + "]";
	}
}
