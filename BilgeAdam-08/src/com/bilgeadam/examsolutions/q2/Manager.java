package com.bilgeadam.examsolutions.q2;

public class Manager extends Employee {

    private String department;
    private static int calculateId = 0;


    public Manager(String department, int empId, String jobTitle, String name, LevelType levelType) {
        super(empId, jobTitle, name, levelType);
        this.department = department;
        System.out.println(++calculateId + " manager is created");
    }

    @Override
    public String printInformation() {
        return this.toString() + super.toString() ;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static int getCalculateId() {
        return calculateId;
    }

    public static void setCalculateId(int calculateId) {
        Manager.calculateId = calculateId;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                '}';
    }
}
