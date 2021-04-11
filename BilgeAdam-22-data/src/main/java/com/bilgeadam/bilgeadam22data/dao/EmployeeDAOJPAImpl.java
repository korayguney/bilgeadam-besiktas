package com.bilgeadam.bilgeadam22data.dao;

import com.bilgeadam.bilgeadam22data.model.Employee;
import com.bilgeadam.bilgeadam22data.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> empList = entityManager.createQuery("from Employee", Employee.class).getResultList();
        return empList;
    }

    @Override
    public Employee findById(int theId) {
        Employee emp = entityManager.find(Employee.class, theId);
        return emp;
    }

    @Override
    public void save(Employee employee) {
        Employee emp = entityManager.merge(employee);
        employee.setId(emp.getId());
    }

    @Override
    public void deleteById(int theId) {
        entityManager.createQuery("delete from Employee e where e.id=:theId").setParameter("theId",theId).executeUpdate();
    }
}
