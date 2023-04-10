package com.intuit.mybooks;

import com.intuit.mybooks.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {
    @Autowired
    CustomerRepository customerRepository;


    public Customer login(String email, String password){
        Customer customer = customerRepository.findByEmail(email);

        return customer;
    }

//    public Customer signUp(String email , String password , String firstName , String lastName){
//        Customer customer = new Customer()
//        customerRepository.save()
//    }


}
