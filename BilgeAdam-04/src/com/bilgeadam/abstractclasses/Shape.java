package com.bilgeadam.abstractclasses;

public abstract class Shape extends Shape2 {

    // abstract method
    public abstract void draw(String shape);
    public abstract void delete();

    // concrete method
    public void concreteMethod(){
        System.out.println("******");
    }

}
