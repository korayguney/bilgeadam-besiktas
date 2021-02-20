package com.bilgeadam.clients;

import com.bilgeadam.models.*;
import com.bilgeadam.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.time.Month;

public class InsuranceClient {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Furkan Okçu","Diyarbakır",453245265423L);
        Customer customer2 = new Customer("Kaan Keskin","Istanbul",74654652334L);

        Vehicle car1 = new Car("Porsche Cayenne",2017,"34GH6463","Black"); // Polymorphism
        Vehicle car2 = new Car("Porsche Panamera",2020,"35AN333","Red"); // Polymorphism
        Vehicle moto1 = new Motorcycle("Harley-Davidson",2014,"34GYY463",1.85); // Polymorphism

        car1.setCustomer(customer1);
        car2.setCustomer(customer2);
        moto1.setCustomer(customer2);

        Accident accident1 = new Accident(LocalDate.of(2021, Month.JANUARY, 21));
        Accident accident2 = new Accident(LocalDate.of(2019, Month.JUNE, 15));
        Accident accident3 = new Accident(LocalDate.of(2018, Month.FEBRUARY, 8));

        car1.getAccidents().add(accident1);
        car2.getAccidents().add(accident1);
        moto1.getAccidents().add(accident2);
        moto1.getAccidents().add(accident3);

        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

        try {
            em.getTransaction().begin();

            em.persist(car1);
            em.persist(car2);
            em.persist(moto1);

            em.persist(customer1);
            em.persist(customer2);

            em.persist(accident1);
            em.persist(accident2);
            em.persist(accident3);

            em.getTransaction().commit();

            System.out.println("All insurance data saved to DB ....");
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }
}
