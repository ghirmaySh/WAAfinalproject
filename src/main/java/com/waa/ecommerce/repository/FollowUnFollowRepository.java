package com.waa.ecommerce.repository;

import com.waa.ecommerce.model.FollowUnFollow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface FollowUnFollowRepository  extends JpaRepository<FollowUnFollow,Integer > {
    @Transactional
    @Modifying
    @Query(value = "insert into  FollowUnFollow(buyerId,selerId) values(buyerId,sellerId)", nativeQuery = true)
    void followSeller(int buyerId, int sellerId);

    @Transactional
    @Modifying
    @Query("delete from FollowUnFollow f where  f.buyerId=:buyerId and f.sellerId=:sellerId")
    void unFollowSeller(int buyerId, int sellerId);
}