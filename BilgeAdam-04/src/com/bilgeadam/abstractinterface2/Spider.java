package com.bilgeadam.abstractinterface2;

public class Spider extends Animal{

    protected Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spiders eat other insects");
    }
}
