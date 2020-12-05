package com.bilgeadam.abstractinterface2;

public abstract class Animal {

    protected int legs;
    private int test;

    public Animal(int legs) {
        this.legs = legs;
    }

    public void walk(){
        System.out.println("This animal walks on "+ this.legs + " legs");
    }

    public abstract void eat();

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
