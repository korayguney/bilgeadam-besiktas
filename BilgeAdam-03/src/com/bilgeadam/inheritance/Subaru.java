package com.bilgeadam.inheritance;

public class Subaru extends Car {
    private double price;

    public Subaru(){
        super("Diesel");
        System.out.println("Inside Subaru constuctor");
    }

    public Subaru(double price) {
        super("default type");
        this.price = price;
    }

    @Override
    public void fromCar() {
        System.out.println("Override fromCar() method at the Subaru class");
    }

    public void fromSubaru(){
        System.out.println("In the Subaru class");
    }
}
