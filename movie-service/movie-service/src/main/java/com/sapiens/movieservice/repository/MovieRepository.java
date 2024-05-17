package com.sapiens.movieservice.repository;

import com.sapiens.movieservice.entity.MovieDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieDetailsEntity, Integer> {

    @Query(value = "select * from Movie_details m where m.movie_name like %:movieName%",nativeQuery = true)
    MovieDetailsEntity findByMovieName(@Param("movieName") String movieName);

    @Query(value = "SELECT M.PRICE FROM Movie_details M WHERE M.MOVIE_NAME LIKE %:movieName%",nativeQuery = true)
    Double findPriceByMovieName(@Param("movieName") String movieName);


    @Query(value = "select m.seats_available from Movie_details m where m.movie_name like %:movieName%",nativeQuery = true)
    Integer findSeatsAvailableByMovieName(@Param("movieName") String movieName);


}
