package com.example.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Car;
import com.example.repository.interface1.CarRepository;

@RestController
public class CarController {
	@Autowired
	private CarRepository caRepository;
	
	@GetMapping("/get_cars")
	public Collection<Car> getCars(){
		return null;
		//return caRepository.findAll().stream().filter()
		
	}
	
}
