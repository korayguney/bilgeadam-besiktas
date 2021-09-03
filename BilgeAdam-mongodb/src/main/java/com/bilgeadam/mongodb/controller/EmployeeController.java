package com.bilgeadam.mongodb.controller;

import com.bilgeadam.mongodb.model.Employee;
import com.bilgeadam.mongodb.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping
    public List<Employee> findAllEmployees(){
        return employeeService.getAllEmployees();
    }

}
