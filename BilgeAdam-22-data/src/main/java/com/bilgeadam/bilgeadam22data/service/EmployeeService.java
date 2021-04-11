package com.bilgeadam.bilgeadam22data.service;

import com.bilgeadam.bilgeadam22data.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int theId);
    void save(Employee employee);
    void deleteById(int theId);


}
