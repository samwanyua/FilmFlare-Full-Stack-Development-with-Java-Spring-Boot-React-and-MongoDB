package com.filmflare.movie.Service;

import com.filmflare.movie.Models.Review;
import com.filmflare.movie.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String imdbId){
        Review review = new Review(reviewBody);
        reviewRepository.insert(review);

    }
}
