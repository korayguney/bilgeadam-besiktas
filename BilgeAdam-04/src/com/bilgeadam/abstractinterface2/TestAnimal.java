package com.bilgeadam.abstractinterface2;

import sun.security.provider.ConfigFile;

public class TestAnimal {

    public static void main(String[] args) {
        System.out.println("---------SPIDER----------");
        // initialized with own reference
        Spider spider = new Spider();
        spider.eat();
        spider.walk();

        // initialized with super reference (Animal)
        Animal spider2 = new Spider();
        spider2.eat();
        spider2.walk();


        System.out.println("---------CAT----------");
        // initialized with own reference
        Cat cat = new Cat();
        cat.eat();
        cat.walk();

        // initialized with super reference (Animal)
        Animal cat2 = new Cat();
        cat2.eat();
        cat2.walk();

        // initialized with interface reference (IPet)
        IPet cat3 = new Cat();
        cat3.setName("Coffee");
        System.out.println(cat3.getName());
        cat3.play();

        System.out.println("---------FISH----------");
        // initialized with interface reference (IPet)
        IPet fish = new Fish();
        fish.setName("Nemo");
        System.out.println(fish.getName());
        fish.play();

        // polymorphism recap
        System.out.println("-----polymorphism recap------");
        Cat garphield = new Cat();
        Animal cat4 = garphield; // upcasting

        Animal fish2 = new Fish();
        if(fish2 instanceof Spider){
            Spider spider1 = (Spider)fish2;
        } else {
            System.out.println("Fish is not a spider");
        }

        System.out.println("---------CanPlay----------");
        canPlay(spider);
        canPlay(cat2);
        canPlay(fish2);

        System.out.println("---------Inteface new features----------");
        IPet.testStatic();
        Cat cat5 = new Cat();
        cat5.testDefault();


    }

    private static void canPlay(Animal a){
        if(a instanceof IPet){
            IPet p = (IPet) a;
            p.play();
        } else {
            System.out.println("Danger!! Wild Animal!!");
        }
    }


}
