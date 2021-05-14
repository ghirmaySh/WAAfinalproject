package com.waa.ecommerce.service;

import com.waa.ecommerce.model.Buyer;
import com.waa.ecommerce.model.Order;
import com.waa.ecommerce.model.Review;

import java.util.List;

public interface BuyerService {

    void addBuyer(Buyer buyer);

    //newCode
    public List<Order> getOrderHistory(Long id);

    public void cancelOrder(Long buyerID, Long orderID);

    void addReview(Long id, Review review);


}
