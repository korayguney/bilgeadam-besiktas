package com.bilgeadam.iterationoverlists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class TestIterationOverCarObject {

    public static void main(String[] args) {

        Car car1 = new Car("Hyundai", 2012);
        Car car2 = new Car("Mercedes", 2011);
        Car car3 = new Car("BMW", 2013);
        Car car4 = new Car("Jaguar", 2012);
        Car car5 = new Car("Toyota", 2020);
        Car car6 = new Car("Nexus", 2020);

        Car[] cars = new Car[5];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;

        List<Car> carList = new ArrayList<>(Arrays.asList(cars));
        carList.add(car6);

        System.out.println("==== ENHANCED FOR ITERATION ====");
        for (Car car : carList) {
            System.out.println(car);
        }

        System.out.println("==== STANDART FOR ITERATION ====");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
        }

        System.out.println("==== WHILE LOOP ITERATION ====");
        int i=0;
        while (i < carList.size()){
            System.out.println(carList.get(i));
            i++;
        }

        System.out.println("==== LIST ITERATION METHOD ====");
        Iterator<Car> carIterator = carList.iterator();
        while (carIterator.hasNext()){
            System.out.println(carIterator.next());
        }

        System.out.println("==== FOREACH ITERATION ====");
        carList.forEach(new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                System.out.println(car);
            }
        });

        System.out.println("==== FOREACH ITERATION WITH LAMBDA ====");
        carList.forEach(car -> System.out.println(car));


    }
}
