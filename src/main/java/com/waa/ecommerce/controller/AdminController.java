package com.waa.ecommerce.controller;

import com.waa.ecommerce.model.User;
import com.waa.ecommerce.service.ReviewService;
import com.waa.ecommerce.service.SellerService;
import com.waa.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    UserService userService;

    @Autowired
    ReviewService reviewService;

     @Autowired
    private SellerService sellerService;

    @RequestMapping("/approveSeller/{id}")
    public void approvedSeller(@PathVariable Integer id, Principal principal) {
        User user= null;
        if(principal!=null){
            String userName = principal.getName();
             user = userService.findByUsername(userName);

        }
        if(user!=null){
            sellerService.approve(id);
        }


    }

    @GetMapping("/approveReview/{id}")
    public void approveReview(@PathVariable Integer id, Principal principal) {
        User user = null;
        if (principal != null) {
            String userName = principal.getName();
            user = userService.findByUsername(userName);

        }
        if (user != null) {
            reviewService.approveReview(id);
        }

    }
}
