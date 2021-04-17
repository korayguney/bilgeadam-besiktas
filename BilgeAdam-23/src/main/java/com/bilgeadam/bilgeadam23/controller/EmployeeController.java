package com.bilgeadam.bilgeadam23.controller;

import com.bilgeadam.bilgeadam23.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
public class EmployeeController {

    private List<Employee> employeeList;

    @PostConstruct
    private void loadData(){

        Employee emp1 = new Employee(1,"Koray","Guney","k@k.com");
        Employee emp2 = new Employee(2,"Ali","Veli","a@k.com");
        Employee emp3 = new Employee(3,"Ayşe","Fatma","f@k.com");

        employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

    }

    @GetMapping("/employees")
    public String listEmployees(Model theModel){

        theModel.addAttribute("employees",employeeList);
        return "employeelist";

    }


}
