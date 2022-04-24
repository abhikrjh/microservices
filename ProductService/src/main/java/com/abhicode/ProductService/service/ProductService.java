package com.abhicode.ProductService.service;

import com.abhicode.ProductService.entity.Product;
import com.abhicode.ProductService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public String saveProduct(Product p){
        try {
            productRepository.save(p);
        }catch (Throwable th){
           return "Error while saving the product";
        }
        return "Product saved successfully";
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(int pId){
        return productRepository.findById(pId);
    }

    public List<Product> getProductByCustomerId(int customerId){
       return productRepository.getProductByCustomerId(customerId);
    }



}
