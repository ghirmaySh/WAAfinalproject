package com.waa.ecommerce.controller;

import com.waa.ecommerce.model.Buyer;
import com.waa.ecommerce.model.Review;
import com.waa.ecommerce.model.Seller;
import com.waa.ecommerce.service.BuyerService;
import com.waa.ecommerce.service.ReviewService;
import com.waa.ecommerce.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecommerce")
public class BuyerSellerController {

    @Autowired
    private SellerService sellerService;

    @Autowired
    private BuyerService buyerService;

    @Autowired
    private ReviewService reviewService;


    @RequestMapping("/addSeller")
    public void addSeller(@RequestBody Seller seller) {

        sellerService.addSeller(seller);
    }

    @RequestMapping("/approve/{id}")

    public void approvedSeller(@PathVariable Integer id) {
        sellerService.approve(id);
    }

    @RequestMapping("/addBuyer")
    public void addBuyer(@RequestBody Buyer buyer) {
        buyerService.addBuyer(buyer);
    }

    @RequestMapping("/approveReview/{id}")

    public void approveReview(@PathVariable Integer id) {
       reviewService.approveReview(id);
    }
    @RequestMapping("/addReview")
    public void addReview(@RequestBody Review review) {
        reviewService.addReview(review);
    }
}
