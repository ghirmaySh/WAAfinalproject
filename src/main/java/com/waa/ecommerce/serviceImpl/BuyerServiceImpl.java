package com.waa.ecommerce.serviceImpl;

import com.waa.ecommerce.model.Buyer;
import com.waa.ecommerce.repository.BuyerRepository;
import com.waa.ecommerce.service.BuyerService;
import com.waa.ecommerce.service.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    BuyerRepository buyerRepository;

    @Override
    public void addBuyer(Buyer buyer) {
      buyerRepository.save(buyer);

    }
}
