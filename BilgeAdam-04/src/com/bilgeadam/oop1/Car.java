package com.bilgeadam.oop1;

import java.util.Objects;

public class Car {

    // variables
    private Engine engine;
    private GearType gearType;
    private String color;
    private int capacity;

    // constructor
    public Car(Engine engine, GearType gearType, String color, int capacity) {
        this.engine = engine;
        this.gearType = gearType;
        this.color = color;
        this.capacity = capacity;
    }

    // getters & setters
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GearType getGearType() {
        return gearType;
    }

    public void setGearType(GearType gearType) {
        this.gearType = gearType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", gearType=" + gearType +
                ", color='" + color + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine);
    }
}
