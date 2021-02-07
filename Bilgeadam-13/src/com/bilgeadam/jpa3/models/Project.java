package com.bilgeadam.jpa3.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String project_name;
    private double project_budget;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees = new ArrayList<>();

    public Project() {
    }

    public Project(String project_name, double project_budget) {
        this.project_name = project_name;
        this.project_budget = project_budget;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public double getProject_budget() {
        return project_budget;
    }

    public void setProject_budget(double project_budget) {
        this.project_budget = project_budget;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", project_name='" + project_name + '\'' +
                ", project_budget=" + project_budget +
                '}';
    }
}
