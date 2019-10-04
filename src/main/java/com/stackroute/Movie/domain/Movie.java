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

//    public Movie() { }
//
//    public Movie(int movieId, int voteCount, String movieTitle, String movieDesc, double voteAverage) {
//        this.movieId = movieId;
//        this.voteCount = voteCount;
//        this.movieTitle = movieTitle;
//        this.movieDesc = movieDesc;
//        this.voteAverage = voteAverage;
//    }
//
//    public int getMovieId() {
//        return movieId;
//    }
//
//    public void setMovieId(int movieId) {
//        this.movieId = movieId;
//    }
//
//    public int getVoteCount() {
//        return voteCount;
//    }
//
//    public void setVoteCount(int voteCount) {
//        this.voteCount = voteCount;
//    }
//
//    public String getMovieTitle() {
//        return movieTitle;
//    }
//
//    public void setMovieTitle(String movieTitle) {
//        this.movieTitle = movieTitle;
//    }
//
//    public String getMovieDesc() {
//        return movieDesc;
//    }
//
//    public void setMovieDesc(String movieDesc) {
//        this.movieDesc = movieDesc;
//    }
//
//    public double getVoteAverage() {
//        return voteAverage;
//    }
//
//    public void setVoteAverage(double voteAverage) {
//        this.voteAverage = voteAverage;
//    }
//
//    @Override
//    public String toString() {
//        return "Movie{" +
//                "movieId=" + movieId +
//                ", voteCount=" + voteCount +
//                ", movieTitle='" + movieTitle + '\'' +
//                ", movieDesc='" + movieDesc + '\'' +
//                ", voteAverage=" + voteAverage +
//                '}';
//    }
}
