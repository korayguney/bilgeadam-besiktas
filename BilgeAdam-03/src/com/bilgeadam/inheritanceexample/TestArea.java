package com.bilgeadam.inheritanceexample;

public class TestArea {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(5.0, 10.2);

        System.out.println("Area of cylinder :" + cylinder.getArea());
        System.out.println("Volume of cylinder :" + cylinder.getVolume());



    }
}
