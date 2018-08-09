package com.moviesbox.movies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviesService {
	
	/*List<Movie> movies = Arrays.asList(
			new Movie(1,"Iron Man","Science Fiction"),
			new Movie(2,"Serendepity","Romance"),
			new Movie(3,"Shopaholic","Comedy")
			); --- Immutable array*/
	
	/*List<Movie> movies = new ArrayList<>(Arrays.asList(
			new Movie(1,"Iron Man","Science Fiction"),
			new Movie(2,"Serendepity","Romance"),
			new Movie(3,"Shopaholic","Comedy")
			));*/
   
	/*public List<Movie> getAllMovies() {
		return movies;
	}
	
	public Movie getMovieById(int id) {
		return movies.stream().filter(movie -> movie.getId() == id).findFirst().get();
	}
	
	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	public void deleteMovie(int id) {
		movies.removeIf(movie -> movie.getId() == id);
	}
	
	public void updateMovie(int id, Movie updatedMovie) {
		for(Movie movie: movies) {
			if(movie.getId() == id) {
				movie.setName(updatedMovie.getName());
				movie.setCategory(updatedMovie.getCategory());
			}
		}
	}*/
	
	@Autowired
	private MoviesRepository movieRespository;
	
	public List<Movie> getAllMovies(){
		List<Movie> movieList = new ArrayList<>();
		movieRespository.findAll().forEach(movieList::add);
		return movieList;
	}
	
	public Movie getMovieById(int id) {
		return movieRespository.findById(id).get();
	}
	
	public void addMovie(Movie movie) {
		movieRespository.save(movie);
	}
	
	public void deleteMovie(int id) {
		movieRespository.deleteById(id);
	}
	
	public void updateMovie(int id, Movie updatedMovie) {
		movieRespository.save(updatedMovie);
	}
}
