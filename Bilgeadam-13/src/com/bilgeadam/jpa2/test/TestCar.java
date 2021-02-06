package com.bilgeadam.jpa2.test;

import com.bilgeadam.jpa2.model.Car;
import com.bilgeadam.jpa2.utils.EntityManagerUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class TestCar {

    private static final Logger logger = Logger.getLogger(TestCar.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.INFO);

        Car car1 = new Car("Toyota", 2001, 120000.00);
        Car car2 = new Car("Honda", 2003, 140000.00);
        Car car3 = new Car("BMW", 2005, 160000.00);
        Car car4 = new Car("Jeep", 2007, 180000.00);
        Car car5 = new Car("Mercedes", 2009, 200000.00);
        Car car6 = new Car("Porsche", 2011, 220000.00);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);

        //persistCars(carList);
        //findCarById(3);
        //findAllCars();
        //deleteCar(1);
        updateCar(3,45000.35);

    }

    private static void updateCar(int id, double price) {
        EntityManager em =EntityManagerUtils.getEntityManager("mysqlPU");
        em.getTransaction().begin();

        Car car = em.find(Car.class, id);
        car.setPrice(price);
        em.merge(car);

        logger.info("Car data updated...");

        em.getTransaction().commit();
        EntityManagerUtils.closeEntityManager(em);
    }

    private static void deleteCar(int id) {
        EntityManager em =EntityManagerUtils.getEntityManager("mysqlPU");
        em.getTransaction().begin();

        Car car = em.find(Car.class, id);
        em.remove(car);

        logger.info("Car data deleted...");

        em.getTransaction().commit();
        EntityManagerUtils.closeEntityManager(em);

    }

    private static void findAllCars() {
        EntityManager em =EntityManagerUtils.getEntityManager("mysqlPU");

        em.createQuery("FROM Car", Car.class).getResultList().stream().forEach(System.out::println);

        EntityManagerUtils.closeEntityManager(em);

    }

    private static Car findCarById(int id) {
        EntityManager em =EntityManagerUtils.getEntityManager("mysqlPU");

        Car car = em.find(Car.class, id);
        logger.info(car);
        logger.debug("DEBUG ::::: " + car.getCarBrand());

        EntityManagerUtils.closeEntityManager(em);
        return car;
    }

    private static void persistCars(List<Car> carList) {
        EntityManager em =EntityManagerUtils.getEntityManager("mysqlPU");
        em.getTransaction().begin();

        for (Car car : carList) {
            em.persist(car);
        }

        logger.info("All cars infos persisted...");

        em.getTransaction().commit();
        EntityManagerUtils.closeEntityManager(em);

    }
}
