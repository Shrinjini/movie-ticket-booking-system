package com.sapiens.movieservice.model;

import lombok.*;

@AllArgsConstructor
@Getter @Setter
@NoArgsConstructor
@ToString
public class MovieDetailsModel {
    private String movie_name;
    private String movie_description;
    private String movie_genre;
    private String movie_language;
    private Double movie_rating;
    private String show_time;
    private int seats_available;
    private Double price;

}
