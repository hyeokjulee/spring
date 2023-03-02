package com.carshop.controller;

import java.util.List;

public interface CarService {
	List<CarDTO> getAllCarList();
	List<CarDTO> getCarListByCategory(String categoty);
	CarDTO getCarById(String carId);
	
	void setNewCar(CarDTO car);
}
