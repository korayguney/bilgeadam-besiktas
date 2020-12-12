package com.bilgeadam.exceptionchallenge2;

import java.time.Duration;

public class EmployeeImpl {
    private Employee[] employees = new Employee[10];

    /**
     * This method adds Employees to the Employee array
     *
     * @param employee Employee
     * @throws InvalidOperationException if an existing employee tried to be added
     */

    public void add(Employee employee) throws InvalidOperationException {
        if(employee.getId() > employees.length-1 || employee.getId() < 0){
            throw new ArrayIndexOutOfBoundsException("The id is exceeded the lenght of the array");
        } else if(employees[employee.getId()] != null){
            throw new InvalidOperationException("The employee is already exist");
        } else {
            employees[employee.getId()] = employee;
            System.out.println("Added employee : " + employee);
        }
    }


    public void delete(int id) throws InvalidOperationException {
        if(employees[id] == null){
            throw new NullPointerException("The id of the employee is already null");
        } else if(id > employees.length-1 || id < 0){
            throw new InvalidOperationException("Out of bounds");
        } else {
            employees[id] = null;
        }
    }

    public Employee findById(int id) throws InvalidOperationException {
        if(employees[id] == null){
            throw new NullPointerException("The id of the employee is null");
        } else if(id > employees.length-1 || id < 0){
            throw new InvalidOperationException("Out of bounds");
        } else {
            return employees[id];
        }
    }

    public Employee[] getAllEmployees(){
        return employees;
    }


}
