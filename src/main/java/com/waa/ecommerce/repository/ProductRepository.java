package com.waa.ecommerce.repository;

import com.waa.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface ProductRepository extends JpaRepository<Product, Long> {

  @Transactional
  @Modifying
  @Query("Delete from Product p Where p.product_id=:id and p.isSold=false")
    void deleteProduct(Long id);

    @Transactional
    @Modifying
    @Query("update Product set isSold=true where product_id=:id")
    void updateSold(Long id);
}
