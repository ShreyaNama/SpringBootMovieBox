package com.moviesbox.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {

	@Autowired
	private MoviesService movies;
	
	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public List<Movies> getAllMovies() {
		return movies.getAllMovies();
	}
}
