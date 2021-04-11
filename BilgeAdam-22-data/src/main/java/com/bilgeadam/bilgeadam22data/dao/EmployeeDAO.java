package com.bilgeadam.bilgeadam22data.dao;

import com.bilgeadam.bilgeadam22data.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int theId);
    void save(Employee employee);
    void deleteById(int theId);


}
