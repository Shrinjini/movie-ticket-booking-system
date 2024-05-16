package com.sapiens.movieservice.controller;

import com.sapiens.movieservice.model.MovieDetailsModel;
import com.sapiens.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie-details")
public class MovieDetailsController {

    @Autowired
    private MovieService service;

    @GetMapping("/all-movie-details")
    public ResponseEntity<List<MovieDetailsModel>> getAllMovieDetails()
    {
        return ResponseEntity.ok(service.getAllMovieDetails());
    }
}
