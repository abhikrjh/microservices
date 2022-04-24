package com.abhicode.ProductService.controllers;

import com.abhicode.ProductService.entity.Product;
import com.abhicode.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/save")
    public String saveProduct(@RequestBody Product p){
        return productService.saveProduct(p);
    }

    @GetMapping("/all")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping({"id"})
    public Optional<Product> getProductById(@PathVariable("id") int pId){
        return productService.getProductById(pId);
    }

    @GetMapping("/customer/{cId}")
    public List<Product> getProductByCustomerId(@PathVariable("cId") int customerId){
        System.out.println("Inside getProductByCustomerId of Product controller");
        return productService.getProductByCustomerId(customerId);
    }


}
