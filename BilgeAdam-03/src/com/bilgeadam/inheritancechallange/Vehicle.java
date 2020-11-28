package com.bilgeadam.inheritancechallange;

public class Vehicle {

    private int size;
    private String name;
    private int speed;

    public Vehicle() {
        this.speed = 0;
    }

    public Vehicle(String name) {
        this.name = name;
        this.speed = 0;
    }

    public Vehicle(int size, String name) {
        this.size = size;
        this.name = name;
        this.speed = 0;
    }

    public void stop(){
        this.speed = 0;
        System.out.println("The vehicle is stopped");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
