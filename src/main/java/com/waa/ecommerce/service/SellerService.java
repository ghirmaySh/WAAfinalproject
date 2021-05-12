package com.waa.ecommerce.service;

import com.waa.ecommerce.model.Buyer;
import com.waa.ecommerce.model.Seller;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SellerService {
    void addSeller(Seller seller);
    void approve(Integer id);
    void sellerBuyPro(Integer id);
    List<Seller> getAllSellers();
}
