package com.waa.ecommerce.serviceImpl;

import com.waa.ecommerce.model.*;
import com.waa.ecommerce.repository.BuyerRepository;
import com.waa.ecommerce.repository.FollowUnFollowRepository;
import com.waa.ecommerce.repository.OrderRepository;
import com.waa.ecommerce.service.BuyerService;
import com.waa.ecommerce.service.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    BuyerRepository buyerRepository;

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public void addBuyer(Buyer buyer) {
        buyerRepository.save(buyer);
    }
   //new code
        @Override
        public List<Order> getOrderHistory(Long id) {
              Long l= new Long(id);
              int i=l.intValue();
            Buyer buyer = buyerRepository.getOne(i);
            List<Order> orderHistory = new ArrayList<>();

            if (buyer != null) {
                for (Order order : buyer.getOrderList()) {
                    if (order.getOrderStatus().equals("DELIVERED")) {
                        orderHistory.add(order);
                    }
                }
            }
            return orderHistory;
        }

        @Override
        public  void cancelOrder(Long buyerId,  Long OrderId) {
            Buyer buyer = buyerRepository.getOne(Math.toIntExact(buyerId));
            List<Order> orders = buyer.getOrderList();
            Order foundOrder = new Order(); // to hold the required Order to be cancelled
            for(Order order : orders){ // iterating through every Order in the buyer's order list to find the exact order that is unshipped
                if(order.getId()== (long)OrderId && (!order.getOrderStatus().equals("SHIPPED"))){
                    foundOrder = order; // unshipped order for the requested orderID
                }
            }
            orders.remove(foundOrder); // removing foundOrder form buyer's list of Orders
            buyer.setOrderList(orders); // Re assigning (Refrashing) the buyer's list of orders excluding the cancelled order
            buyerRepository.save(buyer); // Persisting the buyer
        }

        @Override
        public void addReview(Long id, Review review) {
            Buyer buyer = buyerRepository.getOne(Math.toIntExact(id));
            if(buyer!=null) {
                List<Review> reviews = new ArrayList<>();
                reviews.add(review);
                buyer.setReview(reviews);
                buyerRepository.save(buyer);
            }
        }
    }





