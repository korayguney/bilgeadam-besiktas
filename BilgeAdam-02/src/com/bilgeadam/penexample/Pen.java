package com.bilgeadam.penexample;

public class Pen {
    // overloading of methods
    public void draw(Rectangle r){
        System.out.println("The area of the rectangle : " + r.getHeight() * r.getWidth());
    }

    public void draw(Circle c){
        System.out.println("The area of the circle : " + Math.PI * Math.pow(c.getRadius(), 2));
    }

    public void changeColor(String color, Rectangle r){
        r.setColor(color);
        System.out.println("Color's of the rectangle is " + r.getColor());
    }

    public void changeColor(String color, Circle c){
        c.setColor(color);
        System.out.println("Color's of the circle is " + c.getColor());
    }
}
