package com.hgrup.example.controller;

import static spark.Spark.get;

import com.hgrup.example.service.RatingService;

public class RatingController {

	public RatingController(final RatingService carService) {
	     
		get("/ratings/:manufacturerId", (req, res) -> 
			{
				 Integer id = Integer.valueOf(req.params(":manufacturerId"));
				 return carService.getRating(id);
			});
	  }
}
