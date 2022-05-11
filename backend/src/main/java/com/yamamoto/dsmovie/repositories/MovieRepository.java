package com.yamamoto.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yamamoto.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

	
}
