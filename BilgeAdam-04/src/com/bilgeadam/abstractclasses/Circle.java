package com.bilgeadam.abstractclasses;

public class Circle extends Shape implements Interface1{
    @Override
    public void draw(String shape) {
        System.out.println("Inside draw method... Drawing" + shape);
    }

    @Override
    public void delete() {

    }


    public static void main(String[] args) {
        new Circle().draw("Circle");
        //Shape shape = new Shape();
        Shape shape = new Circle();
    }

    @Override
    public void foo(String shape) {

    }

    @Override
    public void foo() {

    }

    @Override
    public double foo2() {
        return 0;
    }
}
