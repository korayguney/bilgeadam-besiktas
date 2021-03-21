package com.bilgeadam.service;

import com.bilgeadam.exception.EmailAlreadyExistsException;
import com.bilgeadam.model.Course;
import com.bilgeadam.model.User;
import com.bilgeadam.util.HashAlgorithm;
import com.bilgeadam.util.SecurityUtils;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CourseService {
    @PersistenceContext
    EntityManager entityManager;


    public List<Course> getAllCourses() {
        return entityManager.createQuery("from Course", Course.class).getResultList();
    }
}
