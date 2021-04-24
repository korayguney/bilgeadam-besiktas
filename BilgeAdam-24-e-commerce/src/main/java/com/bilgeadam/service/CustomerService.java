package com.bilgeadam.service;

import com.bilgeadam.controller.dto.CustomerDTO;
import com.bilgeadam.entities.Customer;
import com.bilgeadam.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private CustomerRepository repository;

    @Autowired
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<CustomerDTO> findAll() {
       return this.repository.findAll().stream().map(CustomerService::mapToDTO).collect(Collectors.toList());
    }

    public static CustomerDTO mapToDTO(Customer customer){
        if(customer != null){
            return new CustomerDTO(
                    customer.getId(),
                    customer.getFirstName(),
                    customer.getLastName(),
                    customer.getEmail(),
                    customer.getTelephone()
            );
        }
        return null;
    }

    public CustomerDTO create(CustomerDTO customerDTO) {
        return mapToDTO(this.repository.save(
                new Customer(
                        customerDTO.getFirstName(),
                        customerDTO.getLastName(),
                        customerDTO.getEmail(),
                        customerDTO.getTelephone(),
                        Collections.emptySet(),
                        Boolean.TRUE
                )
        ));
    }
}
