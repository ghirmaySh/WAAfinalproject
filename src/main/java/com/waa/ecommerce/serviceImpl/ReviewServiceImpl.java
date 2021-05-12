package com.waa.ecommerce.serviceImpl;

import com.waa.ecommerce.model.Review;
import com.waa.ecommerce.repository.ReviewRepository;
import com.waa.ecommerce.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public void addReview(Review review) {
         reviewRepository.save(review);
    }
    @Override
    public void approveReview(Integer id) {

        reviewRepository.approvedReviews(id);
    }
}
