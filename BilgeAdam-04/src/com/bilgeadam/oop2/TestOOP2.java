package com.bilgeadam.oop2;

public class TestOOP2 {
    public static void main(String[] args) {

        Engine engine1 = new Engine("4734jhjkh4342", 120, 56, EngineType.DIESEL);
        Car car1 = new Car(engine1, GearType.AUTOMATIC, "Brown", 4);

        car1.startEngine(car1.getEngine());
        double car1consumeRate = car1.calculateConsumeRate(100);
        System.out.println("Car consumes  " + car1consumeRate + " at 100 miles" );



    }
}
