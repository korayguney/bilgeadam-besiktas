package com.bilgeadam.repository;

import com.bilgeadam.controller.dto.CustomerDTO;
import com.bilgeadam.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findAllByEnabled(boolean b);
}
