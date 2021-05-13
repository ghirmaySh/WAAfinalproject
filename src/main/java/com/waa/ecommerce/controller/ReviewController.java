package com.waa.ecommerce.controller;

import com.waa.ecommerce.model.Review;
import com.waa.ecommerce.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/addReview")
    public void addReview(@RequestBody Review review) {
        reviewService.addReview(review);
    }

    @GetMapping("/approveReview/{id}")
    public void approveReview(@PathVariable Integer id) {
        reviewService.approveReview(id);
    }
}
