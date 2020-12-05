package com.bilgeadam.abstractinterface2;

public class Fish extends Animal implements IPet{

    private String fishName;

    protected Fish(){
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fishes eat other fishes");
    }

    @Override
    public String getName() {
        return this.getFishName();
    }

    @Override
    public void setName(String name) {
        this.fishName = name;
    }

    @Override
    public void play() {
        System.out.println("Fish " + getFishName() + " is NOT play, because it is a fish");
    }

    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }
}
