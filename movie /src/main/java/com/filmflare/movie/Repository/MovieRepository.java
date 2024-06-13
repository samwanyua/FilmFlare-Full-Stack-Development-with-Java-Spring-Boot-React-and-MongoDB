package com.filmflare.movie.Repository;

import ch.qos.logback.core.testUtil.MockInitialContext;
import com.filmflare.movie.Models.Movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movies, ObjectId> {
    Optional<Movies> findMovieByImdbId (String imdbId);
}
