package com.bilgeadam.abstractinterface2;

public class Cat extends Animal implements IPet{

    private String catName;

    protected Cat() {
        super(4);
    }

    @Override
    public void eat() {
        System.out.println("Cats eat mouse and Royal Canin");
    }

    @Override
    public String getName() {
        return this.getCatName();
    }

    @Override
    public void setName(String name) {
        this.catName = name;
    }

    @Override
    public void play() {
        System.out.println("Cat " + getCatName() + " is playing");
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
