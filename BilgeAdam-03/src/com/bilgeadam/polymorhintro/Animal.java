package com.bilgeadam.polymorhintro;

// superclass
class Animal{
    public void makeSound(){
        System.out.println("No Sound");
    }
}


// subclass
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Havv havv");
    }
}

// subclass
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Miauvv miauvv");
    }
}

class TestClass{
    public static void main(String[] args){
       Animal animal = new Dog();
       animal.makeSound();

       Cat mycat;
       Dog mydog;


       if(animal instanceof Cat) {
           mycat = (Cat)animal; // downcasting
           mycat.makeSound();
       } else {
           System.out.println("animal is not the type of Cat object");
       }

        if(animal instanceof Dog) {
            mydog = (Dog)animal; // downcasting --explicit
            Animal animal1 = mydog; // upcasting --implicit
            mydog.makeSound();
        } else {
            System.out.println("animal is not the type of Dog object");
        }

    }
}

