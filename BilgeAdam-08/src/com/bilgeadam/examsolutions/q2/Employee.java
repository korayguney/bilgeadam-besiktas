package com.bilgeadam.examsolutions.q2;

public class Employee {
    private int empId;
    private String jobTitle;
    private String name;
    private LevelType levelType;

    public Employee(int empId, String jobTitle, String name, LevelType levelType) {
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.name = name;
        this.levelType = levelType;
    }

    public String printInformation(){
        return this.toString();
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LevelType getLevelType() {
        return levelType;
    }

    public void setLevelType(LevelType levelType) {
        this.levelType = levelType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", levelType=" + levelType +
                '}';
    }
}



