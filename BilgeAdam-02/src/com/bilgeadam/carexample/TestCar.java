package com.bilgeadam.carexample;

public class TestCar {

    public static void main(String[] args) {
        
        Car car = new Car();
        car.setCar_brand("Honda");
        car.setCapacity(5);
        car.setColor("Black");
        car.setEngine_power(155.5);
        car.setModel_year(2020);
        car.setMotor_type("DIESEL");
        car.setSpeed(0);

        car.accelerateSpeed(100);
        car.accelerateSpeed(200);
        car.decreaseSpeed(20);
        car.decreaseSpeed(90);

        System.out.println("After last break: " + car.getSpeed());


        
        
    }
    
    
    
}
