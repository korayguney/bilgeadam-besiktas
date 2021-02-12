package com.bilgeadam.jpa3.test;

import com.bilgeadam.jpa2.utils.EntityManagerUtils;
import com.bilgeadam.jpa3.models.Department;
import com.bilgeadam.jpa3.models.Employee;
import com.bilgeadam.jpa3.models.Project;
import jdk.internal.util.EnvUtils;

import javax.persistence.EntityManager;

public class TestEmployeeProject {
    public static void main(String[] args) {
        Department department1 = new Department("IT");
        Department department2 = new Department("Sales");
        Department department3 = new Department("HR");
        Department department4 = new Department("Marketing");

        Project project1 = new Project("AI",100000);
        Project project2 = new Project("Machine Learning",120000);
        Project project3 = new Project("Image Processing",250000);

        Employee employee1 = new Employee("Koray Guney", 37, department1);
        Employee employee2 = new Employee("Kaan Keskin", 25, department4);
        Employee employee3 = new Employee("Furkan Okçu", 27, department3);
        Employee employee4 = new Employee("Oğuzhan Okçu", 25, department3);
        Employee employee5 = new Employee("Sefa Yıldırım", 28, department2);
        Employee employee6 = new Employee("Veli Bostan", 27, department4);

        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        em.getTransaction().begin();

        employee1.getProjects().add(project1);
        employee2.getProjects().add(project2);
        employee3.getProjects().add(project3);
        employee4.getProjects().add(project3);
        employee5.getProjects().add(project2);
        employee6.getProjects().add(project2);

        em.persist(project1);
        em.persist(project2);
        em.persist(project3);

        em.persist(employee1);
        em.persist(employee2);
        em.persist(employee3);
        em.persist(employee4);
        em.persist(employee5);
        em.persist(employee6);

        em.persist(department1);
        em.persist(department2);
        em.persist(department3);
        em.persist(department4);

        em.getTransaction().commit();

        System.out.println("All data persisted...");

        EntityManagerUtils.closeEntityManager(em);
    }
}
