package com.bilgeadam.encapsulation;

public class TestEmployee {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setFullname("İbrahim Bulut");
        emp.setAge(27);

        // save to database method
        System.out.println(emp);

    }


}
