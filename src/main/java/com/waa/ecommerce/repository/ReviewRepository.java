package com.waa.ecommerce.repository;

import com.waa.ecommerce.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ReviewRepository extends JpaRepository<Review ,Long> {

    @Transactional
    @Modifying
    @Query("update Review  set reviewStatus= 1 WHERE  review_Id=:id")
    void approvedReviews(Integer id);
}
