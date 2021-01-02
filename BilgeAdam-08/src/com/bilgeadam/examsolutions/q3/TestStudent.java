package com.bilgeadam.examsolutions.q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {
        Student student1 = new Student("Ali", "Veli", 20);
        Student student2 = new Student("Ayşe", "Ali", 21);
        Student student3 = new Student("Kadir", "Taş", 22);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Collections.sort(students);

        // classic for
        System.out.println("-----------Classic for loop ----------");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("-----------Enhanced for loop ----------");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("-----------Iteration loop ----------");

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------While  loop ----------");

        int a = 0;
        while (a < students.size()){
            System.out.println(students.get(a));
            a++;
        }
    }
}
