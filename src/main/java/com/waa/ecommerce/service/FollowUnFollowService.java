package com.waa.ecommerce.service;


public interface FollowUnFollowService {
    void followSeller(Integer buyerId, Integer sellerId);

    void unFollowSeller(Integer buyerId, Integer sellerId);
}
