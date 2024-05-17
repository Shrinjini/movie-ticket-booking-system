package com.sapiens.movieservice.controller;

import com.sapiens.movieservice.model.MovieDetailsModel;
import com.sapiens.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/movie-by-movie-name/{movieName}")
    public ResponseEntity<MovieDetailsModel> getMovieByMovieName(@PathVariable("movieName") String movieName)
    {
        return ResponseEntity.ok(service.getMovieDetailsByMovieName(movieName));
    }

    @GetMapping("/movie-price-by-movie-name/{movieName}")
    public ResponseEntity<Double> getMoviePriceByMovieName(@PathVariable("movieName") String movieName)
    {
        return ResponseEntity.ok(service.getPriceByMovieName(movieName));
    }

    @GetMapping("/seats-available-by-movie-name/{movieName}")
    public ResponseEntity<Integer> getSeatsAvailableByMovieName(@PathVariable("movieName") String movieName)
    {
        return ResponseEntity.ok(service.getAvailableSeats(movieName));
    }


}
