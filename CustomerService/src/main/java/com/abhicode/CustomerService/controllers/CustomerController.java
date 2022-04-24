package com.abhicode.CustomerService.controllers;


import com.abhicode.CustomerService.entity.Customer;
import com.abhicode.CustomerService.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/save")
    public void saveCustomer(@RequestBody Customer c){
          customerService.saveCustomer(c);
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("{id}")
    public Optional<Customer> getCustomerById(@PathVariable("id") int cId){
        return customerService.getCustomerById(cId);
    }


}
