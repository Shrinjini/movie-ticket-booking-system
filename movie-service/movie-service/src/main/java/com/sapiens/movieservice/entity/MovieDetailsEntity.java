package com.sapiens.movieservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Movie_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movie_id;
    private String movie_name;
    private String movie_description;
    private String movie_genre;
    private String movie_language;
    private Double movie_rating;
    private String show_time;
    private int seats_available;
    private Double price;
}
