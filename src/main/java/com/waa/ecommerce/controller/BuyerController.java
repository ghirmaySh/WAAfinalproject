package com.waa.ecommerce.controller;

import com.waa.ecommerce.model.Buyer;
import com.waa.ecommerce.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buyer")
public class BuyerController {
    @Autowired
    private BuyerService buyerService;

    @PostMapping("/addBuyer")
    public void addBuyer(@RequestBody Buyer buyer) {

        buyerService.addBuyer(buyer);
    }
}
//    @RequestMapping("/approveReview/{id}")
//    public void approveReview(@PathVariable Integer id) {
//        reviewService.approveReview(id);
