package com.jonathanlemos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathanlemos.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
