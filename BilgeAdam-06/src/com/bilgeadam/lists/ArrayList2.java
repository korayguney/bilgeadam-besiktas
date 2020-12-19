package com.bilgeadam.lists;

import com.bilgeadam.serializableexample.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee("Ali", 20);
        Employee emp2 = new Employee("Veli", 21);
        Employee emp3 = new Employee("Ayşe", 19);
        Employee emp4 = new Employee("Ayşe", 19);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println(employees.contains(emp4));


    }
}
