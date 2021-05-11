package com.waa.ecommerce.service;

import com.waa.ecommerce.model.Seller;
import org.springframework.stereotype.Service;


public interface SellerService {
    void addSeller(Seller seller);
    void approve(Integer id);
}
