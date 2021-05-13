package com.waa.ecommerce.controller;

import com.waa.ecommerce.model.Seller;
import com.waa.ecommerce.service.ProductService;
import com.waa.ecommerce.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @Autowired
    private ProductService productService;

//    @Autowired
//    private BuyerService buyerService;

    //    @Autowired
//    private ReviewService reviewService;
    @GetMapping("/")
    public List<Seller> getAllSellers() {

        return sellerService.getAllSellers();
    }

    @PostMapping("/addSeller")
    public void addSeller(@RequestBody Seller seller) {

        sellerService.addSeller(seller);
    }

    @RequestMapping("/approve/{id}")

    public void approvedSeller(@PathVariable Integer id) {
        sellerService.approve(id);
    }

    @GetMapping("/sellerBuyPro/{id}")
    public void sellerBuyProduct(@PathVariable Integer id) {
        sellerService.sellerBuyPro(id);

    }
    @GetMapping("/cancelOrder/{id}")
    public void cancelOrder(@PathVariable Long id){
        productService.cancelOrder(id);
}

//    @PostMapping("/addBuyer")
//    public void addBuyer(@RequestBody Buyer buyer) {
//        buyerService.addBuyer(buyer);
//    }

//    @RequestMapping("/approveReview/{id}")
//    public void approveReview(@PathVariable Integer id) {
//       reviewService.approveReview(id);
//    }
//    @PostMapping("/addReview")
//    public void addReview(@RequestBody Review review) {
//        reviewService.addReview(review);
    }

