package com.sapiens.movieservice.service;

import com.sapiens.movieservice.model.MovieDetailsModel;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MovieService {

    public List<MovieDetailsModel> getAllMovieDetails();

    public MovieDetailsModel getMovieDetailsByMovieName(String movieName);

    public Double getMoviePrice(String movieName);

    public int getAvailableSeats(String movieName);

}
