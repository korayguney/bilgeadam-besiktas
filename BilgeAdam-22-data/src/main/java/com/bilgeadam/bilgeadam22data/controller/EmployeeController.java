package com.bilgeadam.bilgeadam22data.controller;

import com.bilgeadam.bilgeadam22data.model.Employee;
import com.bilgeadam.bilgeadam22data.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // GET --> get list of employees (/employees)
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    // GET --> get selected employee (/employees/{id})
    @GetMapping("/employees/{empId}")
    public Employee getEmployee(@PathVariable int empId){
        Employee emp = employeeService.findById(empId);
        if(emp == null) {
            throw new RuntimeException("Employee id not found -" + empId);
        }

        return emp;
    }

    // POST --> create employee (/employees)
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        employeeService.save(employee);
        return employee;
    }

    // PUT --> update employee (/employees)
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        employeeService.save(employee);
        return employee;
    }


    // DELETE --> delete selected employee (/employees/{id})
    @DeleteMapping("/employees/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int empId){
        Employee emp = employeeService.findById(empId);
        if(emp == null) {
            System.out.println("NOT FOUND");
            return new ResponseEntity<>("Id Not Found -" + empId, HttpStatus.NOT_FOUND);
        }
        employeeService.deleteById(empId);
        return new ResponseEntity<>("Deleted employee id -" + empId, HttpStatus.OK);
    }

}
