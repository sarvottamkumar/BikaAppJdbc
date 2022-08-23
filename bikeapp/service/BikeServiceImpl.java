package com.bikeapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.bikeapp.model.Bike;
import com.bikeapp.repository.IBikeRepository;

@Service
public class BikeServiceImpl implements IBikeService{
	
	@Autowired
	private IBikeRepository bikeRepository;

	@Override
	public List<Bike> getAll() {
		
		
		return bikeRepository.findAll();
	}

	@Override
	public List<Bike> getByName(String name)  {
	
		return bikeRepository.findByName(name);
	}

	@Override
	public List<Bike> getByBrand(String brand)  {
		
		return bikeRepository.findByBrand(brand);
	}

	@Override
	public List<Bike> getByPrice(double price)  {
		return bikeRepository.findByPrice(price);
	}

	@Override
	public Bike getByModelNumber(Integer modelNumber){
		return bikeRepository.findByModelNumber(modelNumber);
	}

	@Override
	public void addBike(Bike bike) {
		
		bikeRepository.addBike(bike);
	}

	@Override
	public void updateBike(Integer modelNumber, double price) {
		bikeRepository.updateBike(modelNumber, price);
		
	}

	@Override
	public void deleteBike(Integer modelNumber) {
		bikeRepository.deleteBike(modelNumber);
		
	}
	
	

}
