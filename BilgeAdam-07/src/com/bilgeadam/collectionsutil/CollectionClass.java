package com.bilgeadam.collectionsutil;

import java.util.*;

public class CollectionClass {

    public static void main(String[] args) {
        Course c1 = new Course(111, "Java Programming");
        Course c2 = new Course(222, "Python Programming");
        Course c3 = new Course(333, "C++ Programming");

        List<Course> courses = new ArrayList<>();

        courses.add(c1);
        courses.add(c2);
        courses.add(c3);

        //Collections.sort(courses);
        /*
        Collections.sort(courses, new Comparator<Course>() {
            @Override
            public int compare(Course o1, Course o2) {
                return o2.getCourse_id() - o1.getCourse_id();
            }
        });
         */

        Collections.sort(courses, (o1, o2) -> o2.getCourse_id() - o1.getCourse_id());


        for (Course cours : courses) {
            System.out.println(cours);
        }
        System.out.print("MAX : ");
        Course c = Collections.max(courses);
        System.out.println(c);

        System.out.print("MIN : ");
        Course cmin = Collections.min(courses);
        System.out.println(cmin);

        System.out.println("REVERSED ORDER");
        Collections.reverse(courses);
        for (Course cours : courses) {
            System.out.println(cours);
        }

    }
}
