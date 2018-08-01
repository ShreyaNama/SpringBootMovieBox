package com.moviesbox.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {

	@Autowired
	private MoviesService movieservice;
	
	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public List<Movie> getAllMovies() {
		return movieservice.getAllMovies();
	}
	
	@RequestMapping(value = "/movies/{id}", method = RequestMethod.GET)
	public Movie getMovieById(@PathVariable int id) {
		return movieservice.getMovieById(id);
	}
	
	@RequestMapping(value = "/movies", method = RequestMethod.POST)
	public void addMovie(@RequestBody Movie movie) {
		movieservice.addMovie(movie);
	}
	
	@RequestMapping(value = "/movies/{id}", method = RequestMethod.DELETE)
	public void addMovie(@PathVariable int id) {
		movieservice.deleteMovie(id);
	}
	
	@RequestMapping(value = "/movies/{id}", method = RequestMethod.PUT)
	public void addMovie(@PathVariable int id, @RequestBody Movie movie) {
		movieservice.updateMovie(id, movie);
	}
}
