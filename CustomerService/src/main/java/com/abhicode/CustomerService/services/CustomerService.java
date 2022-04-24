package com.abhicode.CustomerService.services;

import com.abhicode.CustomerService.entity.Customer;
import com.abhicode.CustomerService.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    public void saveCustomer(Customer c){
        customerRepo.save(c);
    }

    public List<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }

    public Optional<Customer> getCustomerById(int id){
        return customerRepo.findById(id);
    }



}
