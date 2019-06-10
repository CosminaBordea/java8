package com.hgrup.example.service;

import com.hgrup.example.model.Rating;

public class RatingService {

	public Rating getRating(Integer id) {
		Rating rationg = new Rating();
		rationg.setKey(1);
		rationg.setStarNb(5);
		return rationg;
	}
}
