package com.showroom;

public class Company {
	private String Cname;
	private int Id;
	private Car c1;
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Car getC1() {
		return c1;
	}
	public void setC1(Car c1) {
		this.c1 = c1;
	}
	@Override
	public String toString() {
		return "Company [Cname=" + Cname + ", Id=" + Id + ", c1=" + c1 + "]";
	}
	
}
