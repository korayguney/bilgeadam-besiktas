package com.bilgeadam.controller;

import com.bilgeadam.controller.dto.CustomerDTO;
import com.bilgeadam.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerDTO> findAll(){
        return customerService.findAll();
    }

    @PostMapping
    public CustomerDTO createCustomer(CustomerDTO customerDTO){
        return customerService.create(customerDTO);
    }

}
