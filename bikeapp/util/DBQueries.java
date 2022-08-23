package com.bikeapp.util;

public class DBQueries {
	
	public static final String INSERTQUERY= "INSERT INTO BIKE(bike_name,bike_brand,price,model_number) values(?,?,?,?)";
	public static final String UPDATEQUERY ="UPDATE BIKE SET bike_brand=? WHERE model_number=?";
	public static final String DELETEQuery ="DELETE FROM BIKE WHERE model_number=?";
	
	
	public static final String SELECTBYNAME="SELECT * FROM BIKE WHERE BIKE_NAME=?";
	public static final String SELECTBYBRAND="SELECT * FROM BIKE WHERE BIKE_BRAND=?";
	public static final String SELECTBYPRICE="SELECT * FROM BIKE WHERE PRICE=?";
	public static final String SELECTBYMODELNUMBER="SELECT * FROM BIKE WHERE MODEL_NUMBER=?";
	public static final String SELECTBYQUERY="SELECT * FROM BIKE";
}
