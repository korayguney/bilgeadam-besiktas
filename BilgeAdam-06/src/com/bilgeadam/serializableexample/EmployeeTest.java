package com.bilgeadam.serializableexample;

import java.io.*;

public class EmployeeTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serialize("employee.ser");
        deserialize("employee.ser");
    }

    public static void deserialize(String filename) throws IOException, ClassNotFoundException {

        BufferedInputStream bis =  new BufferedInputStream(new FileInputStream(filename));
        ObjectInputStream ois = new ObjectInputStream(bis);
        Employee emp = (Employee) ois.readObject();
        System.out.println(emp);
    }



    public static void serialize(String filename) throws IOException {
        Employee employee = new Employee();
        employee.setName("Koray");
        employee.setAddress("Tuzla");
        employee.setAge(36);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
        oos.writeObject(employee);
        System.out.println("The employee is serialized");

    }

}
