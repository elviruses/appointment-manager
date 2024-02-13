package net.appointment.controller;

import net.appointment.api.ReviewsApi;
import net.appointment.model.Review;
import net.appointment.model.ReviewInput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewsController implements ReviewsApi {

    @Override
    public ResponseEntity<Void> deleteReviewById(String reviewId) {
        return ReviewsApi.super.deleteReviewById(reviewId);
    }

    @Override
    public ResponseEntity<Review> getReviewById(String reviewId) {
        return ReviewsApi.super.getReviewById(reviewId);
    }

    @Override
    public ResponseEntity<Review> updateReviewById(String reviewId, ReviewInput reviewInput) {
        return ReviewsApi.super.updateReviewById(reviewId, reviewInput);
    }
}
