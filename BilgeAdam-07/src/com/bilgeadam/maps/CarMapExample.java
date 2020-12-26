package com.bilgeadam.maps;

import java.util.*;

public class CarMapExample {

    public static void main(String[] args) {

        Car car1 = new Car("Renault clio", 38432);
        Car car2 = new Car("Renault megane", 43422);
        Car car3 = new Car("Hyundai Getz", 8654);
        Car car4 = new Car("Mercedes A180", 99393);
        Car car5 = new Car("Citroen DS4", 77554);

        Map<Integer, Car> myCarMap = new LinkedHashMap<>();
        myCarMap.put(1, car1);
        myCarMap.put(2, car2);
        myCarMap.put(3, car3);
        myCarMap.put(4, car4);
        myCarMap.put(5, car5);

        for (Map.Entry<Integer,Car> car : myCarMap.entrySet()) {
            System.out.println(car);
        }

        // convert to list
        List<Map.Entry<Integer,Car>> entries = new LinkedList<>(myCarMap.entrySet());

        // sort the list with comparator
        Collections.sort(entries, new Comparator<Map.Entry<Integer, Car>>() {
            @Override
            public int compare(Map.Entry<Integer, Car> o1, Map.Entry<Integer, Car> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });





    }


}
