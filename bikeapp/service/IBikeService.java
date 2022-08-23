package com.bikeapp.service;

import java.util.List;
import com.bikeapp.model.Bike;

public interface IBikeService {
	
	void addBike(Bike bike);
	void updateBike(Integer modelNumber,double price);
	void deleteBike(Integer modelNumber);
	
	List<Bike> getAll();
	List<Bike> getByName(String name);
	List<Bike> getByBrand(String brand);
	List<Bike> getByPrice(double price);
	Bike getByModelNumber(Integer modelNumber);

}
