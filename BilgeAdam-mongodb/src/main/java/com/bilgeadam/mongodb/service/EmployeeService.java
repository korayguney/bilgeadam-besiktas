package com.bilgeadam.mongodb.service;

import com.bilgeadam.mongodb.model.Employee;
import com.bilgeadam.mongodb.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
