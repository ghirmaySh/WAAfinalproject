package com.waa.ecommerce.serviceImpl;

import com.waa.ecommerce.model.Buyer;
import com.waa.ecommerce.model.Seller;
import com.waa.ecommerce.repository.SellerRePository;
import com.waa.ecommerce.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service

public class SellerServiceImpl implements SellerService {

    @Autowired
    SellerRePository sellerRePository;
    @Override
    public void addSeller(Seller seller) {
     sellerRePository.save(seller);
    }

    @Override
    public void approve(Integer id) {
        sellerRePository.approved(id);
    }


    }




