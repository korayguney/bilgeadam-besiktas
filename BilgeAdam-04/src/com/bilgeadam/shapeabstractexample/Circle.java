package com.bilgeadam.shapeabstractexample;

public class Circle extends Shape {
    private int radius;

    public Circle(String color) {
        super(color);
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("The area of the circle : " + Math.PI * Math.pow(getRadius(), 2));
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
