package com.moviesbox.movies;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MoviesService {
   
	public List<Movies> getAllMovies() {
		return Arrays.asList(
				new Movies("Iron Man","Science Fiction"),
				new Movies("Serendepity","Romance"),
				new Movies("Shopaholic","Comedy")
				);
	}
}
