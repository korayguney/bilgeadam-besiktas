package com.bilgeadam;

public class Student {
    private int id;
    private String fullname;
    private int school_number;

    public Student(int id, String fullname, int school_number) {
        this.id = id;
        this.fullname = fullname;
        this.school_number = school_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getSchool_number() {
        return school_number;
    }

    public void setSchool_number(int school_number) {
        this.school_number = school_number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", school_number=" + school_number +
                '}';
    }
}
