package com.filmflare.movie.Service;

import com.filmflare.movie.Models.Movies;
import com.filmflare.movie.Repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired // to instantiate the class for us
    private MovieRepository movieRepository; // reference

    public List<Movies> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movies> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
