package com.hgrup.example.controller;

import com.hgrup.example.service.CarService;

import static spark.Spark.*;

public class CarController {

	public CarController(final CarService carService) {
	     
		get("/cars", (req, res) -> carService.getAllCars());
	  }
}
