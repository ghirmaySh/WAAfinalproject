package com.waa.ecommerce.serviceImpl;

import com.waa.ecommerce.model.Product;
import com.waa.ecommerce.repository.ProductRepository;
import com.waa.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {

        Product  p =null;
        try{
            p =productRepository.findById(id).get();
        }catch (NoSuchElementException e){
            p=null;
        }
        return p;
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
    public void deleteProduct(Long id) {
        productRepository.deleteProduct(id);
    }
    @Override
    public Product updateProduct(Product product) {
if(product.getProduct_id()==null)return null;
Product p = getProductById(product.getProduct_id());
if(p==null)return null;
if(product.getProductName()!=null){
    p.setProductName(product.getProductName());
}
if(product.getDescription()!=null){
    p.setDescription(product.getDescription());
}
if(product.getImage()!=null){
    p.setImage(product.getImage());

}
if(product.isSold()==true){
    p.setSold(product.isSold());
}
if(product.getPrice()!=0){

p.setPrice(product.getPrice());
    }
if(product.getCategory()!=null){
p.setCategory(product.getCategory());
}
return productRepository.save(p);
    }

    @Override
    public void updateSold(Long id) {
        productRepository.updateSold(id);
    }
}
