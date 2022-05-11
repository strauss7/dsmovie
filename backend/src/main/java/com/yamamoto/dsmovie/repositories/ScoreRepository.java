package com.yamamoto.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yamamoto.dsmovie.entities.Score;
import com.yamamoto.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

	
}
