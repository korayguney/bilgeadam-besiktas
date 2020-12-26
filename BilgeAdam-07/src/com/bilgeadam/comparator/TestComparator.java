package com.bilgeadam.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

    public static void main(String[] args) {
        List<ComparableStudent> studentList = new ArrayList<>(3);
        Comparator<ComparableStudent> sortName = new StudentSortName();
        Comparator<ComparableStudent> sortGpa = new StudentSortGpa();

        ComparableStudent c1 = new ComparableStudent("Ali", 323, 3.4);
        ComparableStudent c2 = new ComparableStudent("Hasan", 454, 3.2);
        ComparableStudent c3 = new ComparableStudent("Fatma", 654, 2.7);
        ComparableStudent c4 = new ComparableStudent("Şaban", 432, 4.0);
        studentList.add(c1);
        studentList.add(c2);
        studentList.add(c3);
        studentList.add(c4);

        System.out.println("Compare according to student name");
        Collections.sort(studentList, sortName);
        for (ComparableStudent student : studentList) {
            System.out.println("\t" + student.getName());
        }

        System.out.println("Compare according to student gpa");
        Collections.sort(studentList, sortGpa);
        for (ComparableStudent student : studentList) {
            System.out.println("\t" + student.getName() + "-->" + student.getGpa());
        }
    }

}
