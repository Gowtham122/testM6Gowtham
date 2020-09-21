package com.dxc.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.movie.entity.Movie;
import com.dxc.movie.service.MovieServiceImp;

import io.swagger.annotations.ApiOperation;

@ApiOperation(value="/mvn",tags="Movie Controller with RestFull")
@Controller
@RestController
@RequestMapping(path="/mms")
public class MovieController {
	
	@Autowired
	Movie movie;
	
	@Autowired
	MovieServiceImp service;
	
	@ApiOperation(value="insert Movie details",produces="json data",response=Movie.class)
	@PostMapping(path="/add")
	public Movie addMovie(@RequestBody Movie movie) {
		return service.addMovie(movie);
		
	}
	@DeleteMapping("/delete/{movie_id}")
	public void deleteMovie(@PathVariable("movie_id") int movie_id) {
		service.deleteMovie(movie_id);
		
	}
	
	@GetMapping(path="/movies")
	public List<Movie>getAllMovies(){
		return service.getAllMovies();
	}

}
