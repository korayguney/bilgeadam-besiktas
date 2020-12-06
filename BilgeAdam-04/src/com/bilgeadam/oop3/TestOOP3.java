package com.bilgeadam.oop3;

public class TestOOP3 {
    public static void main(String[] args) {

        System.out.println("--------- CAR ---------");
        Engine engine1 = new Engine("4734jhjkh4342", 120, 56, EngineType.DIESEL);
        Car car1 = new Car(engine1, GearType.AUTOMATIC, "Brown", 4);

        car1.startEngine(car1.getEngine());
        double car1consumeRate = car1.calculateConsumeRate(100);
        System.out.println("Car consumes  " + car1consumeRate + " at 100 miles" );


        System.out.println("--------- BOAT ---------");
        Engine engine2 = new Engine("4734jhjkh4342", 450, 340, EngineType.DIESEL);
        Boat azimut = new Boat(engine2, GearType.AUTOMATIC, "White");

        azimut.startEngine(azimut.getEngine());
        System.out.println("Car consumes  " + azimut.calculateConsumeRate(450) + " at 450 miles" );


        System.out.println("--------- FIX STAGE ---------");

        Mechanic haydarUsta = new Mechanic();
        haydarUsta.fixVehicle(car1);
        haydarUsta.fixVehicle(azimut);


    }
}
