package com.bilgeadam.overriding;

// superclass
public class Animal{
    public String makeNoise(){
        return "No Sound";
    }

    protected Animal getAnimal(){
        return new Animal();
    }
}

// subclass
class Lion extends Animal{
    @Override
    public String makeNoise(){
        return "Roarrr!";
    }

    @Override
    protected Lion getAnimal() {
        return new Lion();
    }
}

// subclass
class Tiger extends Animal{
    @Override
    public String makeNoise(){
        return "Tiger sound!";
    }

    @Override
    public Animal getAnimal() {
        return new Lion();
    }
}

class TestAnimal {
    public static void main(String[] args) {
        System.out.println(new Lion().makeNoise());
    }
}
