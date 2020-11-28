package com.bilgeadam.inheritance;

public class Car extends Vehicle{
    private String motortype;

    public Car(String motortype){
        super();
        System.out.println("Inside Car constuctor");
    }

    public void fromCar(){
        System.out.println("In the Car class");
    }
}
