package com.bilgeadam.shapeabstractexample;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("The area of the rectangle : " + getHeight() * getWidth());
    }

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    /*public void draw(){
        System.out.println("The area of the rectangle : " + getHeight() * getWidth());
    }

     */


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
