package com.bilgeadam.shapetest;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void draw(){
        System.out.println("I  cannot draw, because I don't have an exact shape");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
