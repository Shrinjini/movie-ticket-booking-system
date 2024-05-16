package com.sapiens.movieservice.service;

import com.sapiens.movieservice.entity.MovieDetailsEntity;
import com.sapiens.movieservice.model.MovieDetailsModel;
import com.sapiens.movieservice.repository.MovieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository repository;

    @Autowired
    private ModelMapper mapper;


    @Override
    public List<MovieDetailsModel> getAllMovieDetails( ) {
        
        List<MovieDetailsEntity> entityList= repository.findAll();
        List<MovieDetailsModel> modelList = new ArrayList<>();

       for(MovieDetailsEntity e:entityList)
       {
           MovieDetailsModel model = new MovieDetailsModel();
           model.setMovie_genre(e.getMovie_genre());
           model.setMovie_name(e.getMovie_name());
           model.setMovie_language(e.getMovie_language());
           model.setMovie_rating(e.getMovie_rating());
           model.setMovie_description(e.getMovie_description());
           model.setPrice(e.getPrice());
           model.setShow_time(e.getShow_time());
           model.setSeats_available(e.getSeats_available());
           modelList.add(model);
       }

       return modelList;
        
    }

    @Override
    public MovieDetailsModel getMovieDetailsByMovieName(String movieName) {
        return null;
    }

    @Override
    public Double getMoviePrice(String movieName) {
        return null;
    }

    @Override
    public int getAvailableSeats(String movieName) {
        return 0;
    }
}
