package com.bikeapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bikeapp.model.Bike;

public class BikeMapper implements RowMapper<Bike>{

	@Override
	public Bike mapRow(ResultSet rs, int rowNum) throws SQLException {
		
			Bike bike = new Bike();
			
			bike.setName(rs.getString("bike_name"));
			bike.setBrand(rs.getString("bike_brand"));
			bike.setPrice(rs.getDouble("price"));
			bike.setModelNumber(rs.getInt("model_number"));
			
			return bike;
		
	}

}
