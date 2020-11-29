package com.bilgeadam.inheritanceexample;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius) {
       super(radius);
       this.height = height;
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public Cylinder() {
    }

    public double getVolume(){
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return 2*super.getArea() + 2*Math.PI*getRadius()*height ;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
