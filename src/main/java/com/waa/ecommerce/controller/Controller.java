package com.waa.ecommerce.controller;

import com.waa.ecommerce.model.Seller;
import com.waa.ecommerce.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecommerce")
public class Controller {

    @Autowired
    private SellerService  sellerService;

    @RequestMapping("/addSeller")
     public void addSeller(@RequestBody Seller seller){
        sellerService.addSeller(seller);

    }

    @RequestMapping("/approve/{id}")

    public void approvedSeller( @PathVariable Integer id ){
        sellerService.approve(id);
    }
}
