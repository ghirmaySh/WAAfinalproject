package com.waa.ecommerce.controller;

import com.waa.ecommerce.model.*;
import com.waa.ecommerce.service.BuyerService;
import com.waa.ecommerce.service.FollowUnFollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/buyer")
public class BuyerController {
    @Autowired
    private BuyerService buyerService;

    @Autowired
    private FollowUnFollowService followUnFollowService;

    @PostMapping("/addBuyer")
    public void addBuyer(@RequestBody Buyer buyer) {

        buyerService.addBuyer(buyer);
    }

    @PostMapping("/unFollowSeller")
    public void unFollowSeller(@RequestBody FollowUnFollow followUnFollow) {
        int buyerId = 0, sellerId = 0;
        if (followUnFollow != null) {
            buyerId = followUnFollow.getBuyerId();
        }

        if (followUnFollow.getSellerId() != 0) {
            sellerId = followUnFollow.getSellerId();
        }

        if (buyerId != 0 && sellerId != 0) {
            followUnFollowService.unFollowSeller(buyerId, sellerId);
        }

    }

    @PostMapping("/followSeller")
    public void followSeller(@RequestBody FollowUnFollow followUnFollow) {
        Integer buyerId = 0, sellerId = 0;
        if (followUnFollow != null) {
            buyerId = followUnFollow.getBuyerId();
        }

        if (followUnFollow.getSellerId() != 0) {
            sellerId = followUnFollow.getSellerId();
        }

        if (buyerId != 0 && sellerId != 0) {
            followUnFollowService.followSeller(buyerId, sellerId);

        }
    }

//    @RequestMapping("/approveReview/{id}")
//    public void approveReview(@PathVariable Integer id) {
//        reviewService.approveReview(id);

    @GetMapping("/orderHistory/{id}")
    public List<Order> getOrderHistory(@PathVariable Long id) {
        return buyerService.getOrderHistory(id);
    }


    @PutMapping("/cancelOrder/{buyerId}/{orderId}")
    public void cancelOrder(@PathVariable Long buyerId, @PathVariable Long orderId) {
        buyerService.cancelOrder(buyerId, orderId);
    }

    @GetMapping("/{id}/review")
    public void review(@PathVariable Long id, @RequestBody Review review) {
        buyerService.addReview(id, review);
    }
}