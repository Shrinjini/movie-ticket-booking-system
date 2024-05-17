package com.sapiens.movieservice.service;

import com.sapiens.movieservice.model.MovieDetailsModel;

import java.util.List;


public interface MovieService {

    List<MovieDetailsModel> getAllMovieDetails();

    MovieDetailsModel getMovieDetailsByMovieName(String movieName);

    Double getPriceByMovieName(String movieName);

    int getAvailableSeats(String movieName);

}
