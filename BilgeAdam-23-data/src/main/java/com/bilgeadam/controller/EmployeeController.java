package com.bilgeadam.controller;

import com.bilgeadam.model.Employee;
import com.bilgeadam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeRepository repository;

    @Autowired
    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/employees/search/{keyword}")
    public List<Employee> searchEmployeeByFirstName(@PathVariable String keyword){
        return repository.findByFirstNameLike("%"+keyword+"%");
    }

    @GetMapping("/employees/searchAge/{age}")
    public List<Employee> searchEmployeeByAgeLessThan(@PathVariable Integer age){
        return repository.findByAgeLessThan(age);
    }

    @GetMapping("/employees/searchAgeGreater/{age}")
    public List<Employee> searchEmployeeByAgeGreaterThan(@PathVariable Integer age){
        return repository.findFirst2ByAgeGreaterThan(age);
    }

    @GetMapping("/employees/searchAgeLess/{age}")
    public List<Employee> searchEmployeeByAgeLessThanOrderBy(@PathVariable Integer age){
        return repository.findFirst3ByAgeLessThanOrderByLastNameAsc(age);
    }

    @Transactional
    @DeleteMapping("/employees/{email}")
    public String deleteEmployeeWİthEmail(@PathVariable String email){
        repository.deleteByEmail(email);
        return "Deleted...";
    }

    @GetMapping("/getNumberOfEmployees")
    public Integer getNumberOfEmployees(){
        return repository.getTotalNumberOfEmployees();
    }


    @GetMapping("/getAgesWithGrouping")
    public List<?> getAgesWithGrouping(){
        return repository.getAgesWithGrouping();
    }

    @GetMapping("/getAgesWithGroupingNative")
    public List<?> getAgesWithGroupingNative(){
        return repository.getAgesWithGroupingNativeQuery();
    }
}
