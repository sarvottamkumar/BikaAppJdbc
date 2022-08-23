package com.bikeapp.repository;

import java.util.List;

import com.bikeapp.model.Bike;

public interface IBikeRepository {
	
	void addBike(Bike bike);
	void updateBike(Integer modelNumber,double price);
	void deleteBike(Integer modelNumber);
	
	List<Bike> findAll();
	List<Bike> findByName(String name);
	List<Bike> findByBrand(String brand);
	List<Bike> findByPrice(double price);
	
	Bike findByModelNumber(Integer modelNumber);

}
