package com.bikeapp.repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bikeapp.model.Bike;
import com.bikeapp.util.DBQueries;

@Repository
public class BikeRepositoryImpl implements IBikeRepository{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplet(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

	@Override
	public List<Bike> findAll() {
		RowMapper<Bike> mapper = new BikeMapper();
		List<Bike> bikers = jdbcTemplate.query(DBQueries.SELECTBYQUERY, mapper);
		
		return bikers;
	}

	@Override
	public List<Bike> findByName(String name) {
		List<Bike> bikers = jdbcTemplate.query(DBQueries.SELECTBYNAME,
				(rs,rowNum)-> {
						Bike bike = new Bike();
						bike.setName(rs.getString("bike_name"));
						bike.setBrand(rs.getString("bike_brand"));
						bike.setPrice(rs.getDouble("price"));
						bike.setModelNumber(rs.getInt("model_number"));
						return bike;
				},name);
		return bikers;
	}

	@Override
	public List<Bike> findByBrand(String brand) {
		List<Bike> bikers = jdbcTemplate.query(DBQueries.SELECTBYBRAND,
				(rs,rowNum)-> {
						Bike bike = new Bike();
						bike.setName(rs.getString("bike_name"));
						bike.setBrand(rs.getString("bike_brand"));
						bike.setPrice(rs.getDouble("price"));
						bike.setModelNumber(rs.getInt("model_number"));
						return bike;
				},brand);
		return bikers;
	}

	@Override
	public List<Bike> findByPrice(double price) {
		List<Bike> bikers = jdbcTemplate.query(DBQueries.SELECTBYPRICE,
				(rs,rowNum)-> {
						Bike bike = new Bike();
						bike.setName(rs.getString("bike_name"));
						bike.setBrand(rs.getString("bike_brand"));
						bike.setPrice(rs.getDouble("price"));
						bike.setModelNumber(rs.getInt("model_number"));
						return bike;
				},price);
		return bikers;
	}

	@Override
	public Bike findByModelNumber(Integer modelNumber) {
		Bike nbikers = jdbcTemplate.queryForObject(DBQueries.SELECTBYMODELNUMBER,
				(rs,rowNum)-> {
						Bike bike = new Bike();
						bike.setName(rs.getString("bike_name"));
						bike.setBrand(rs.getString("bike_brand"));
						bike.setPrice(rs.getDouble("price"));
						//bike.setModelNumber(rs.getInt("model_number"));
						bike.setModelNumber(modelNumber);
						return bike;
				},modelNumber);
		return nbikers;
	}
	

    @Override
	public void addBike(Bike bike) {
		String sql = DBQueries.INSERTQUERY;
		
		Object[] bikeArray = { bike.getName(),bike.getBrand(),bike.getPrice(),bike.getModelNumber()};
		jdbcTemplate.update(sql,bikeArray);
	}

	@Override
	public void updateBike(Integer modelNumber, double price) {
		String sql = DBQueries.UPDATEQUERY;
		jdbcTemplate.update(sql,price,modelNumber);
	}



	@Override
	public void deleteBike(Integer modelNumber) {
		jdbcTemplate.update(DBQueries.DELETEQuery,modelNumber);
	}

	
	
	

}
