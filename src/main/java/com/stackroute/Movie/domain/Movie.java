package com.stackroute.Movie.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Movie {
    @Id
    int movieId;
    int voteCount;
    String movieTitle,movieDesc;
    double voteAverage;
}
