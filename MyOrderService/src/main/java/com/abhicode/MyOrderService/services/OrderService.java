package com.abhicode.MyOrderService.services;

import com.abhicode.MyOrderService.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {
    // RestTemplateBuilder is by default given by spring-boot
//    @Autowired
//    private RestTemplateBuilder restTemplateBuilder;

    @Autowired
    RestTemplate restTemplate;

    public List<Product> getMyOrders(int customerId) {
        String url = "http://PRODUCT-SERVICE/products/customer/" + customerId;
        System.out.println("url " + url);
        List<Product> products = restTemplate.getForObject(url, List.class);
        return products;
    }

}
