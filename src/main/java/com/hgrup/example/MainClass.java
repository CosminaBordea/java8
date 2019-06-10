package com.hgrup.example;

import java.util.List;
import static spark.Spark.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.hgrup.example.controller.CarController;
import com.hgrup.example.controller.RatingController;
import com.hgrup.example.model.Car;
import com.hgrup.example.service.CarService;
import com.hgrup.example.service.RatingService;

public class MainClass {
	
//	private CompletableFuture<List<Car>> getCars() {
//		CarService serv = new CarService();
//		CompletableFuture<List<Car>> cars = serv.getAllCars().stream().collect(Collectors.toList()); 
//	}

	public static void main(String[] args) {
			get("/cars/", (req, res) -> "<h1>H Bid</h1>");
			
//		new CarController(new CarService());
//		new RatingController(new RatingService());
	}

}
