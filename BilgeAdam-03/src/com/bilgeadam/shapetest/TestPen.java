package com.bilgeadam.shapetest;


public class TestPen {

    public static void main(String[] args) {

       Rectangle rectangle = new Rectangle("Black");
       rectangle.setHeight(100);
       rectangle.setWidth(50);

       Circle circle = new Circle("Turkish blue");
       circle.setRadius(25);

       Pen pen = new Pen();
       pen.draw(rectangle);
       pen.draw(circle);

       pen.changeColor("Blue", rectangle);
       pen.changeColor("White", circle);
    }



}
