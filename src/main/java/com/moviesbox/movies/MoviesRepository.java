package com.moviesbox.movies;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface MoviesRepository extends CrudRepository<Movie, Integer>{

	

	//getAllMovies
	//getMovie(int id)
	//updateMovie(Movie m)
	//deleteMovie(int id)
	
	
}
