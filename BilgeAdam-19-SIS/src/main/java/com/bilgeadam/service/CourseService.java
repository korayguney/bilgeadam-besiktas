package com.bilgeadam.service;

import com.bilgeadam.exception.EmailAlreadyExistsException;
import com.bilgeadam.model.Course;
import com.bilgeadam.model.User;
import com.bilgeadam.util.HashAlgorithm;
import com.bilgeadam.util.SecurityUtils;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CourseService {
    @PersistenceContext
    EntityManager entityManager;


    public List<Course> getAllCourses() {
        return entityManager.createQuery("from Course", Course.class).getResultList();
    }

    public void deleteCourse(Course course) {
        Course foundCourse = entityManager.find(Course.class, course.getId());
        entityManager.remove(foundCourse);
    }

    public boolean isCourseOnDatabase(String courseCode) {
        try {
            Course course = entityManager.createQuery("from Course c WHERE c.courseCode=:courseCode", Course.class)
                    .setParameter("courseCode",courseCode).getSingleResult();
        } catch (NoResultException e) {
            return false;
        }
        return true;
    }

    public void saveNewCourse(Course course) {
        entityManager.persist(course);
    }

    public Course findCourse(int courseId) {
        return entityManager.find(Course.class, courseId);
    }

    public void updateCourse(Course course) {
        entityManager.merge(course);
    }
}
