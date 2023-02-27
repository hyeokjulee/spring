package com.carshop.controller;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class CarRepositoryImpl implements CarRepository {
	private List<CarDTO> listOfCars = new ArrayList<CarDTO>();
	
	public CarRepositoryImpl() {
		CarDTO car1 = new CarDTO("c0001","소나타","2500","승용차","거의 새거");
		CarDTO car2 = new CarDTO("c0002","그랜저","3500","승용차","아주 새거");
		CarDTO car3 = new CarDTO("c0003","아반떼","2000","승용차","극히 새거");
		
		listOfCars.add(car1);
		listOfCars.add(car2);
		listOfCars.add(car3);
	}
	
	@Override
	public List<CarDTO> getAllCarList() {
		return listOfCars;
	}
}
