package com.carshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
	@Autowired
	private CarRepository carRepository;
	
	@Override
	public List<CarDTO> getAllCarList() {
		return carRepository.getAllCarList();
	}
	
	@Override
	public List<CarDTO> getCarListByCategory(String categoty) {
		return carRepository.getCarListByCategory(categoty);
	}
	
	@Override
	public CarDTO getCarById(String carId) {
		return carRepository.getCarById(carId);
	}
	
	@Override
	public void setNewCar(CarDTO car) {
		carRepository.setNewCar(car);
	};
}
