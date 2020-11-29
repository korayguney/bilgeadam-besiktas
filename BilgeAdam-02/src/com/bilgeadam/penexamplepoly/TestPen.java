package com.bilgeadam.penexamplepoly;

public class TestPen {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getColor());
        rectangle.setHeight(100);
        rectangle.setWidth(200);

        Circle circle = new Circle();
        System.out.println(circle.getColor());
        circle.setRadius(25);

        Pen pen = new Pen();
        pen.draw(rectangle);
        pen.draw(circle);

        pen.changeColor("White", rectangle);
        pen.changeColor("Purple", circle);

    }



}
