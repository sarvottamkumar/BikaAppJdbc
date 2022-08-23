package com.bikeapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bikeapp.model.Bike;
import com.bikeapp.model.Brand;
import com.bikeapp.service.IBikeService;

@SpringBootApplication
public class SpringBikeappBasicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBikeappBasicApplication.class, args);
	}
	
	@Autowired
	IBikeService bikeService; 	

	@Override
	public void run(String... args) throws Exception {
		Bike bike= new Bike("Duke", Brand.KTM.name(), 420000,1);
		bikeService.addBike(bike);
		bikeService.getAll().forEach(System.out::println);
	}

}
