package com.bilgeadam.serializableexample2;

import com.bilgeadam.serializableexample.Employee;

import java.io.*;

public class StudentTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serialize("student.ser");
        deserialize("student.ser");
    }

    public static void deserialize(String filename) throws IOException, ClassNotFoundException {

        BufferedInputStream bis =  new BufferedInputStream(new FileInputStream(filename));
        ObjectInputStream ois = new ObjectInputStream(bis);
        Student student = (Student) ois.readObject();
        System.out.println(student);

        bis.close();
        ois.close();
    }



    public static void serialize(String filename) throws IOException {
        Course c1 = new Course(111, "Java Programming");
        Course c2 = new Course(222, "Python Programming");
        Course c3 = new Course(333, "C++ Programming");
        Course[] courses = new Course[]{c1, c2, c3};

        Student student = new Student(123, "Veli Bostan", courses);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
        oos.writeObject(student);
        System.out.println("The student is serialized");

        oos.close();

    }




}
