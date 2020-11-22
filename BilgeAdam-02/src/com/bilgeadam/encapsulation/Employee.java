package com.bilgeadam.encapsulation;

public class Employee {

    private int id;
    private String fullname;
    private int age;

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if(age < 65 && age > 0)
            this.age = age;
       else
           System.err.println("The age input is wrong");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                '}';
    }
}
