package com.abhicode.MyOrderService.controllers;

import com.abhicode.MyOrderService.entities.Product;
import com.abhicode.MyOrderService.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("{cId}")
    public List<Product> myOrders(@PathVariable("cId") int customerId){
        return orderService.getMyOrders(customerId);
    }

}
