package com.bilgeadam.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String courseCode;
    private String courseName;

    @OneToMany(mappedBy = "user")
    private List<UserCourse> userList = new ArrayList<>();

    public Course() {
    }

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<UserCourse> getUserList() {
        return userList;
    }

    public void setUserList(List<UserCourse> userList) {
        this.userList = userList;
    }
}
