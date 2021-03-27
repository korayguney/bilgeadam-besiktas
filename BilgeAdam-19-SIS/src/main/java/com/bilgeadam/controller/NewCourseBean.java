package com.bilgeadam.controller;

import com.bilgeadam.model.Course;
import com.bilgeadam.service.CourseService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class NewCourseBean {

    private Course course;

    @EJB
    private CourseService courseService;

    @PostConstruct
    public void init() {
        course = new Course();
    }

    public String saveCourse() {
        boolean result = courseService.isCourseOnDatabase(this.course.getCourseCode());
        if (!result) {
            courseService.saveNewCourse(this.course);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Success ",
                    "  Course is saved to database"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "WARNING ",
                    "  There is already identical course on database!"));
        }
        return "addcourse";
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public CourseService getCourseService() {
        return courseService;
    }

    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }
}
