package com.dxc.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.movie.entity.Movie;
@Repository
public interface IMoviedao extends JpaRepository<Movie,Integer> {

}
