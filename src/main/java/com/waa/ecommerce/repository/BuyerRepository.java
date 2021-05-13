package com.waa.ecommerce.repository;

import com.waa.ecommerce.model.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer,Integer> {



}
