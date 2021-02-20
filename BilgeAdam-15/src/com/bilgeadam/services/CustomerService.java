package com.bilgeadam.services;

import com.bilgeadam.models.Customer;
import com.bilgeadam.models.Vehicle;
import com.bilgeadam.repositories.CrudRepository;
import com.bilgeadam.repositories.CustomerRepository;
import com.bilgeadam.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.util.List;

public class CustomerService implements CrudRepository<Customer>,CustomerRepository {

    EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = em.createQuery("from Customer",Customer.class).getResultList();
        EntityManagerUtils.closeEntityManager(em);
        return customers;
    }

    @Override
    public Customer findById(int id) {
        Customer c = em.find(Customer.class, id);
        EntityManagerUtils.closeEntityManager(em);
        return c;
    }

    @Override
    public void saveToDatabase(Customer customer) {
        try {
            em.getTransaction().begin();
            em.persist(customer);
            em.getTransaction().commit();
        } catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public void deleteFromDatabase(Customer customer) {
        try {
            em.getTransaction().begin();
            Customer c = em.createQuery("from Customer c WHERE c.SSID=:custSSID",Customer.class).setParameter("custSSID",customer.getSSID()).getSingleResult();
            em.remove(c);
            em.getTransaction().commit();
        } catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public void deleteFromDatabase(int id) {
        try {
            em.getTransaction().begin();
            Customer c = em.find(Customer.class, id);
            em.remove(c);
            em.getTransaction().commit();
        } catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }

    }

    @Override
    public void updateOnDatabase(Customer object) {

    }


    @Override
    public boolean isExistsOnDatabase(long SSID) {
        try {
            Customer customer = em.createQuery("from Customer c WHERE c.SSID =:custId",Customer.class)
                    .setParameter("custId",SSID).getSingleResult();
            return true;
        } catch (NoResultException e) {
            e.printStackTrace();
            return false;
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public List<Vehicle> findVehiclesOfCustomer(long SSID) {
        List<Vehicle> vehicles = em.createQuery("from Vehicle v WHERE v.customer.SSID=:custID",Vehicle.class)
                .setParameter("custID",SSID).getResultList();
        EntityManagerUtils.closeEntityManager(em);
        return vehicles;
    }
}
