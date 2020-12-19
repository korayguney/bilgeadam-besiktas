package com.bilgeadam.serializableexample2;

import java.util.Arrays;

public class Student extends Person {

    private int student_id;
    private String name;
    private Course[] courses;

    public Student(int student_id, String name, Course[] courses) {
        this.student_id = student_id;
        this.name = name;
        this.courses = courses;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", name='" + name + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
