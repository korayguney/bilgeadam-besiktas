package com.bilgeadam.services;

import com.bilgeadam.models.Customer;
import com.bilgeadam.models.Vehicle;
import com.bilgeadam.repositories.CrudRepository;
import com.bilgeadam.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class VehicleService implements CrudRepository<Vehicle> {
    EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

    @Override
    public List<Vehicle> findAll() {
        List<Vehicle> vehicles = em.createQuery("from Vehicle",Vehicle.class).getResultList();
        EntityManagerUtils.closeEntityManager(em);
        return vehicles;
    }

    @Override
    public Vehicle findById(int id) {
        return null;
    }

    @Override
    public void saveToDatabase(Vehicle object) {

    }

    @Override
    public void deleteFromDatabase(Vehicle object) {

    }

    @Override
    public void deleteFromDatabase(int id) {

    }

    @Override
    public void updateOnDatabase(Vehicle object) {

    }
}
