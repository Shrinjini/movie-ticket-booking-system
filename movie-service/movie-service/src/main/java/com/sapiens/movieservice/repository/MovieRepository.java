package com.sapiens.movieservice.repository;

import com.sapiens.movieservice.entity.MovieDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieDetailsEntity, Integer> {


}
