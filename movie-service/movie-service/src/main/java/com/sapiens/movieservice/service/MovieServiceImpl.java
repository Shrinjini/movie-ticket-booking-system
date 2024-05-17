package com.sapiens.movieservice.service;

import com.sapiens.movieservice.entity.MovieDetailsEntity;
import com.sapiens.movieservice.model.MovieDetailsModel;
import com.sapiens.movieservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository repository;

    private MovieDetailsModel getModelDataFromEntityData(MovieDetailsEntity entity) {
        MovieDetailsModel model = new MovieDetailsModel();
        model.setMovie_genre(entity.getMovie_genre());
        model.setMovie_name(entity.getMovie_name());
        model.setMovie_language(entity.getMovie_language());
        model.setMovie_rating(entity.getMovie_rating());
        model.setMovie_description(entity.getMovie_description());
        model.setPrice(entity.getPrice());
        model.setShow_time(entity.getShow_time());
        model.setSeats_available(entity.getSeats_available());

        return model;
    }

    @Override
    public List<MovieDetailsModel> getAllMovieDetails( ) {

        List<MovieDetailsEntity> entityList = repository.findAll();
        List<MovieDetailsModel> modelList = new ArrayList<>();

        for (MovieDetailsEntity e : entityList) {
            MovieDetailsModel model = getModelDataFromEntityData(e);
            modelList.add(model);
        }

        return modelList;

    }

    @Override
    public MovieDetailsModel getMovieDetailsByMovieName(String movieName) {

        MovieDetailsEntity entity = repository.findByMovieName(movieName);
        MovieDetailsModel model = getModelDataFromEntityData(entity);

        return model;
    }

    @Override
    public Double getPriceByMovieName(String movieName) {

        return repository.findPriceByMovieName(movieName);
    }

    @Override
    public int getAvailableSeats(String movieName) {

        return repository.findSeatsAvailableByMovieName(movieName);
    }
}
