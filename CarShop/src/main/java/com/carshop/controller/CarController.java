package com.carshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
}
