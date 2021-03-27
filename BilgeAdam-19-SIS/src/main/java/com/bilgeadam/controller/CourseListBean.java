package com.bilgeadam.controller;

import com.bilgeadam.model.Course;
import com.bilgeadam.service.CourseService;
import com.bilgeadam.service.UserService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.List;

@ManagedBean
public class CourseListBean {

    private List<Course> courseList;

    @EJB
    private CourseService courseService;

    @PostConstruct
    public void init(){
        courseList = courseService.getAllCourses();
    }

    public String deleteCourse(Course course){
        courseService.deleteCourse(course);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Delete success",
                "  Course deleted from database!"));
        return "courselist?faces-redirect=true";
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public CourseService getCourseService() {
        return courseService;
    }

    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }
}
