package com.bilgeadam.nestedclasschallenge;

public class HelloWorldOuterClass {

    // member (instance) inner (nested) class
    abstract static class HelloWorld {
        abstract void greetSomeone(String name);
    }

    @FunctionalInterface
    interface HelloWorldInterface {
        void greetSomeone(String name);
    }

    public void sayHello() {
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
/*
        HelloWorld turkishGreeting = new HelloWorld() {
            @Override
            void greetSomeone(String name) {
                System.out.println("Merhaba " + name);
            }
        };
 */
        HelloWorldInterface turkishGreeting = new HelloWorldInterface() {
            @Override
            public void greetSomeone(String name) {
                System.out.println("Merhaba " + name + " FI");
            }
        };

        HelloWorldInterface turkishGreeting2 = name -> System.out.println("Merhaba " + name + " FI");

        turkishGreeting.greetSomeone("Sefa");
    }

}
