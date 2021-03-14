package com.bilgeadam.service;

import com.bilgeadam.model.Coffee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class CoffeeService {

    @PersistenceContext
    EntityManager entityManager;

    public void saveOrder(Coffee coffee){
        entityManager.persist(coffee);
    }

    public List<Coffee> getAllOrders() {
        return entityManager.createQuery("from Coffee",Coffee.class).getResultList();
    }

    public void deleteOrder(Coffee coffee) {
        Coffee c = entityManager.createQuery("from Coffee c WHERE c.customerName=:cname",Coffee.class).setParameter("cname",coffee.getCustomerName()).getSingleResult();
        entityManager.remove(c);
    }
}
