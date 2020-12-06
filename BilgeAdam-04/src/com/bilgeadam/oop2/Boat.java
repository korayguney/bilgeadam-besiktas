package com.bilgeadam.oop2;

import java.util.Objects;

public class Boat extends Vehicle {
    // variables
    private Engine engine;
    private GearType gearType;

    // constructors
    public Boat(Engine engine, GearType gearType, String color) {
        super(0, color);
        this.engine = engine;
        this.gearType = gearType;
    }

    @Override
    public boolean startEngine(Engine engine) {
        System.out.println(engine.startEngine() + " and it's type is " + engine.getEngineType());
        return true;
    }

    // custom methods
    @Override
    public double calculateConsumeRate(int miles) {
        double totalConsumeRate =  getGearType().consumeRatePerMile(getEngine().getEngineType()) * miles;
        return totalConsumeRate;
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

    @Override
    public String toString() {
        return "Boat{" +
                "engine=" + engine +
                ", gearType=" + gearType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boat boat = (Boat) o;
        return Objects.equals(engine, boat.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine);
    }
}
