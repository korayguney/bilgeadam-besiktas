package com.bilgeadam.builderexample2;

public class TestCar {
    public static void main(String[] args) {
        Car bmw = new Car.Builder().setBrand("BMW").setModel("M3").setPrice(2423424).setColor(Color.RED).build();
    }
}
