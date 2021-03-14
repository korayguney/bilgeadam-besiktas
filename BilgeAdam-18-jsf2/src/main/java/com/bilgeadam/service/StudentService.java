package com.bilgeadam.service;

import com.bilgeadam.model.Student;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class StudentService {

    @PersistenceContext
    EntityManager entityManager;

    public void saveStudent(Student student) {
        entityManager.persist(student);
    }

    public List<Student> getAllStudentsList() {
        List<Student> students = entityManager.createQuery("from Student", Student.class).getResultList();
        return students;
    }
}
