package com.hgrup.example.service;

import java.util.ArrayList;
import java.util.List;

import com.hgrup.example.model.Car;

public class CarService {
	
	public List<Car> getAllCars() {
		List<Car> cars = new ArrayList<Car>();
		
		Car car1= new Car();
		car1.setKey(1);
		car1.setMark("Opal");
		
		Car car2 = new Car();
		car2.setKey(2);
		car2.setMark("Toshiba");
		
		cars.add(car1);
		cars.add(car2);
		
		return cars;
	}

}
