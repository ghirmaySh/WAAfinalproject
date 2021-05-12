package com.waa.ecommerce.service;

import com.waa.ecommerce.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();
    public void addProduct(Product product);
    public Product getProductById(Long id);
    public void deleteProductById(Long id);
    public Product updateProduct(Product product);
}
