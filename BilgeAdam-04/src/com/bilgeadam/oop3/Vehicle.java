package com.bilgeadam.oop3;

public abstract class Vehicle {
    // variables
    private int numOfTyres;
    private String color;

    // Constructors
    public Vehicle(int numOfTyres, String color) {
        this.numOfTyres = numOfTyres;
        this.color = color;
    }

    // abstract custom methods
    public abstract boolean startEngine(Engine engine);
    public abstract double calculateConsumeRate(int mile);

    // getters & setters
    public int getNumOfTyres() {
        return numOfTyres;
    }

    public void setNumOfTyres(int numOfTyres) {
        this.numOfTyres = numOfTyres;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
