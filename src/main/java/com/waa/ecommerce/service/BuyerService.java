package com.waa.ecommerce.service;

import com.waa.ecommerce.model.Buyer;

public interface BuyerService {
    void approveReview(Integer id);

    void addBuyer(Buyer buyer);
}
