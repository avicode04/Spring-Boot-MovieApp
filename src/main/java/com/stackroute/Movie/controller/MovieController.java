package com.stackroute.Movie.controller;


import com.stackroute.Movie.domain.Movie;
import com.stackroute.Movie.exception.MovieAlreadyExistException;
import com.stackroute.Movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class MovieController {
    MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    public MovieController() {

    }

    @PostMapping("movie")
    public ResponseEntity saveMovie(@RequestBody Movie movie) throws MovieAlreadyExistException {
        ResponseEntity responseEntity;
        Movie m = null;
        try {
            m = movieService.saveMovie(movie);
            responseEntity = new ResponseEntity<Movie>(m, HttpStatus.CREATED);
        } catch (MovieAlreadyExistException ex) {

            responseEntity = new ResponseEntity<Movie>(m, HttpStatus.CONFLICT);
        }
//        movieService.saveMovie(movie);
        return responseEntity;
    }

//    @PostMapping("movie")
//    public ResponseEntity showMovie(){
//        ResponseEntity responseEntity;
//        try{
//            movieService.showMovieList();
//            responseEntity = new ResponseEntity<String>("Successfully created", HttpStatus.CREATED);
//        }catch(Exception ex){
//            responseEntity=new ResponseEntity<String>(ex.getMessage(),HttpStatus.CONFLICT);
//        }
//        movieService.showMovieList();
//        return responseEntity;
//    }

    @PutMapping("movie")
    public ResponseEntity updateMovie(@RequestBody Movie movie) {
        ResponseEntity responseEntity;
        Movie m = null;
        try {
            m = movieService.updateMovie(movie);
            responseEntity = new ResponseEntity<Movie>(m, HttpStatus.CREATED);
        } catch (Exception ex) {
            responseEntity = new ResponseEntity<Movie>(m, HttpStatus.CONFLICT);
        }
//        movieService.updateMovie(movie);
        return responseEntity;
    }

    @DeleteMapping("movie")
    public ResponseEntity deleteMovie(@RequestBody Movie movie) {
        ResponseEntity responseEntity;
        Movie m = null;
        try {
            m = movieService.deleteMovie(movie.getMovieId());
            responseEntity = new ResponseEntity<Movie>(m, HttpStatus.CREATED);
        } catch (Exception ex) {
            responseEntity = new ResponseEntity<Movie>(m, HttpStatus.CONFLICT);
        }
        return responseEntity;
    }

//    @GetMapping("movie")
//    public ResponseEntity getMovie(){
//        ResponseEntity responseEntity;
//        List<Movie> movieList=null;
//        try{
//            movieList=movieService.showMovieList();
//            responseEntity=new ResponseEntity<List<Movie>>(movieList,HttpStatus.CREATED);
//        }catch (Exception ex){
//            responseEntity=new ResponseEntity<List<Movie>>(movieList,HttpStatus.CONFLICT);
//        }
//        return responseEntity;
//  }

    @GetMapping("movie")
//    @ResponseBody
    public ResponseEntity getMovie(@RequestParam("movieTitle") String title) {
        ResponseEntity responseEntity;
        List<Movie> m = null;
        try {
            m = movieService.trackByName(title);
            responseEntity = new ResponseEntity<List<Movie>>(m, HttpStatus.CREATED);
        } catch (Exception ex) {
            responseEntity = new ResponseEntity<List<Movie>>(m, HttpStatus.CONFLICT);
        }
        return responseEntity;
    }

}
