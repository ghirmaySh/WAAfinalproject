package com.waa.ecommerce.controller;
import com.waa.ecommerce.service.ProductService;
import com.waa.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public List<Product> getAll() {
       return productService.getAllProducts();

    }
    @PostMapping("/")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }@GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id){
        Product p = productService.getProductById(id);
        if(p==null){
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
       return new ResponseEntity<Product>(p,HttpStatus.OK) ;
    }
    @DeleteMapping("/{id}")
public ResponseEntity<Product> deleteProductById(@PathVariable("id")Long id){

        Product p = productService.getProductById(id);
        if(p==null){
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
        productService.deleteProductById(id);
        return new ResponseEntity<Product>(p, HttpStatus.OK);
}
@PutMapping("/")
public ResponseEntity<Product> updateProduct(@RequestBody Product product){
        Product p = productService.updateProduct(product);

        if(p==null){
            return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Product>(p, HttpStatus.ACCEPTED);
}

}