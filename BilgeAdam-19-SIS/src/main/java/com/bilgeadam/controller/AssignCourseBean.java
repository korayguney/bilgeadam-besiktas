package com.bilgeadam.controller;

import com.bilgeadam.model.Course;
import com.bilgeadam.model.User;
import com.bilgeadam.service.CourseService;
import com.bilgeadam.service.UserService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.List;
import java.util.Map;

@ManagedBean
public class AssignCourseBean {
    private User user;
    private Course course;

    private int selectedUserId;
    private int selectedCourseId;

    @EJB
    private UserService userService;

    @EJB
    private CourseService courseService;


    @PostConstruct
    public void init(){
        user = new User();
        course = new Course();
    }

    public String assign(){
        Map<User,Course> result = userService.assignCourseToStudent(selectedUserId, selectedCourseId);

        for(Map.Entry<User,Course> a: result.entrySet()){
            user = a.getKey();
            course = a.getValue();
        }

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Assign success",
                user.getFirstname() +" is assigned to " + course.getCourseName()));
        return "assigncourse";
    }

    public List<User> getAllInstructors(){
        return userService.getAllInstructors();
    }

    public List<User> getAllStudents(){
        return userService.getAllStudents();
    }

    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getSelectedUserId() {
        return selectedUserId;
    }

    public void setSelectedUserId(int selectedUserId) {
        this.selectedUserId = selectedUserId;
    }

    public int getSelectedCourseId() {
        return selectedCourseId;
    }

    public void setSelectedCourseId(int selectedCourseId) {
        this.selectedCourseId = selectedCourseId;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public CourseService getCourseService() {
        return courseService;
    }

    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }
}
