package com.waa.ecommerce.service;

import com.waa.ecommerce.model.Review;

public interface ReviewService {
    public void addReview(Review review);
    void approveReview(Integer id);
}
