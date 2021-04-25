package com.bilgeadam.controller;

import com.bilgeadam.controller.dto.CustomerDTO;
import com.bilgeadam.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public CustomerDTO findById(@PathVariable Long id){
        return customerService.findById(id);
    }

    @GetMapping("/inactive")
    public List<CustomerDTO> findAllInactive(){
        return customerService.findAllInactive();
    }

    @GetMapping("/active")
    public List<CustomerDTO> findAllActive(){
        return customerService.findAllActive();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        customerService.delete(id);
    }

    @PostMapping
    public CustomerDTO createCustomer(CustomerDTO customerDTO){
        return customerService.create(customerDTO);
    }

}
