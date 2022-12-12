package com.showroom;

public class Car {
	private int cost;
	private String brand;
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Car [cost=" + cost + ", brand=" + brand + "]";
	}
}
