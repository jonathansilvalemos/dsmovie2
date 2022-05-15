package com.jonathanlemos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathanlemos.dsmovie.entities.Score;
import com.jonathanlemos.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
