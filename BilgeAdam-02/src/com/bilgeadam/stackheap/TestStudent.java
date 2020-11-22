package com.bilgeadam.stackheap;

import com.bilgeadam.constuctors.*;

public class TestStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        VipCustomer vp;
        TestCustomer ts;

        // Objects are copies their reference
        // shallow copy (sığ kopyalama)
        Student student1 = new Student();
        student1.setName("Sefa Yıldırım");
        student1.setAddress("Istanbul");
        student1.setSchool_id(145);

        System.out.println("Student 1 name: (1) " + student1.getName());


        Student student2 = student1;
        student2.setName("Veli Bostan");

        System.out.println("Student 1 address: (1) " + student2.getAddress());

                student1.setAddress("Manisa");
        System.out.println("Student 1 name: (2) " + student1.getName());
        System.out.println("Student 1 address: (1) " + student2.getAddress());

        // primitive types copies their datas

        int a = 10;
        int b = a; // b = 10;
        System.out.println("a : " + a + ",b: " + b);
        a = 20;
        System.out.println("a : " + a + ",b: " + b);

        // clone example
        // deep-copy (derin kopyalama)
        Student student3 = (Student) student1.clone();
        System.out.println("Cloned student name :(1) " + student3.getName());
        student1.setName("Koray Guney");
        System.out.println("Cloned student name :(2) " + student3.getName());

    }

}
