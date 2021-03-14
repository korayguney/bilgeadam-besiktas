package com.bilgeadam.mbean;

import com.bilgeadam.model.Student;
import com.bilgeadam.service.StudentService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class StudentBean {
    private Student student = new Student();
    private List<Student> students = new ArrayList<>();

    @EJB
    private StudentService studentService;

    public void saveStudent(){
        studentService.saveStudent(student);
        students = studentService.getAllStudentsList();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
