package com.bilgeadam.nestedclasschallenge;

public class HelloWorldOuterClass {

    // member (instance) inner (nested) class
    abstract static class HelloWorld {
        abstract void greetSomeone(String name);
    }

    public void sayHello(){
        // local inner class
        class EnglishGreeting extends HelloWorld {
            @Override
            void greetSomeone(String name) {
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englistGreeting = new EnglishGreeting();
        englistGreeting.greetSomeone("Furkan");


    }


    public static void main(String[] args) {
        new HelloWorldOuterClass().sayHello();

        // Anonymous inner class
        HelloWorld frenchGreeting = new HelloWorld() {
            @Override
            void greetSomeone(String name) {
                System.out.println("Salut " + name);
            }
        };

        frenchGreeting.greetSomeone("Kaan");

        HelloWorld turkishGreeting = new HelloWorld() {
            @Override
            void greetSomeone(String name) {
                System.out.println("Merhaba " + name);
            }
        };

        turkishGreeting.greetSomeone("Sefa");
    }

}
