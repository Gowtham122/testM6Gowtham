package com.dxc.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.movie.dao.IMoviedao;
import com.dxc.movie.entity.Movie;

@Service
public class MovieServiceImp implements IMovieService {
	
	@Autowired
	Movie mve;
	
	@Autowired
	IMoviedao dao;
	
	@Override
	public Movie addMovie(Movie movie) {
		// TODO Auto-generated method stub
		return dao.save(movie);
	}

	@Override
	public void deleteMovie(int movie_id) {
		// TODO Auto-generated method stub
		dao.deleteById(movie_id);

	}

	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
