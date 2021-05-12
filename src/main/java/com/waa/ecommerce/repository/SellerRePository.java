package com.waa.ecommerce.repository;

import com.waa.ecommerce.model.Seller;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface SellerRePository extends JpaRepository<Seller, Long> {

    @Transactional
    @Modifying
    @Query("update Seller set isApproved = 1 where seller_id=:id")
    void approved(Integer id);

    @Transactional
    @Modifying
    @Query("update Seller set  canBuy = 1 where seller_id=:id")
    void sellerBuyPro(Integer id);
}
