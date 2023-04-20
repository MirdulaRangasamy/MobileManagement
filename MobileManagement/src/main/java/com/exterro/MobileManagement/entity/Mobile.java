package com.exterro.MobileManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobile {
	@Id	
	private String imeiNo;
	private String brand;
	private String model;
	private double price;
	public Mobile() {
		super();
	}
	public Mobile(String imeiNo, String brand, String model, double price) {
		super();
		this.imeiNo = imeiNo;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public String getImeiNo() {
		return imeiNo;
	}
	public void setImeiNo(String imeiNo) {
		this.imeiNo = imeiNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [imeiNo=" + imeiNo + ", brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
}
