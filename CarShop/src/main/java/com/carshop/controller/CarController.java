package com.carshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {
	@Autowired
	private CarService carService;
	
	@RequestMapping("/cars")
	public String carList(Model model) {
		List<CarDTO> list = carService.getAllCarList();
		model.addAttribute("carList", list);
		return "cars";
	}
	
	@GetMapping("/{ccate}")
	public String requestCarsByCategory(@PathVariable("ccate") String carCategory, Model model) {
		List<CarDTO> carsByCategory = carService.getCarListByCategory(carCategory);
		model.addAttribute("carList", carsByCategory);
		return "cars";
	}
}
