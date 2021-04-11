package com.bilgeadam.bilgeadam22data.dao;

import com.bilgeadam.bilgeadam22data.model.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Employee> findAll() {
        System.out.println("Inside EmployeeDAOHibernateImpl");
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public Employee findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Employee.class, theId);
    }

    @Override
    public void save(Employee employee) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(employee);
    }

    @Override
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.createQuery("delete from Employee e where e.id=:employeeId").setParameter("employeeId",theId).executeUpdate();
    }
}
