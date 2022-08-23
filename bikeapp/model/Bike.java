package com.bikeapp.model;


public class Bike {
	
	private String name;
	private String brand;
	private double price;
	private Integer modelNumber;
	
	public Bike() {
		super();
	}

	public Bike(String name, String brand, double price, Integer modelNumber) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.modelNumber = modelNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(Integer modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	@Override
	public String toString() {
		return "Bike [name=" + name + ", brand=" + brand + ", price=" + price + ", modelNumber=" + modelNumber + "]";
	}
	
	
	
	

}
