package com.waa.ecommerce.serviceImpl;

import com.waa.ecommerce.model.FollowUnFollow;
import com.waa.ecommerce.repository.FollowUnFollowRepository;
import com.waa.ecommerce.service.FollowUnFollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowUnFollowImpl  implements FollowUnFollowService {

    @Autowired
    FollowUnFollowRepository followUnFollowRepository;

    @Override
    public void followSeller(Integer buyerId, Integer sellerId) {

        followUnFollowRepository.followSeller(buyerId,sellerId);
    }

    @Override
    public void unFollowSeller(Integer buyerId, Integer sellerId) {

        followUnFollowRepository.unFollowSeller(buyerId,sellerId);
    }
}
