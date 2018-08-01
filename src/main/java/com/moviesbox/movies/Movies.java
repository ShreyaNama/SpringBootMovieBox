package com.moviesbox.movies;

public class Movies {
	
	private String name;
	private String category;
	
	public Movies(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
