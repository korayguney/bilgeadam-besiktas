package com.bilgeadam.nestedclasses;

public class AnonymousInnerClassExample {

    // member inner class
    public interface InnerInterface {
        public void sayHello(String name);
    }

    public void greetSomeone(String name, InnerInterface inner){
        inner.sayHello(name);
    }

    public static void main(String[] args) {
        AnonymousInnerClassExample example = new AnonymousInnerClassExample();

        // Anonymous inner (nested) class
//        example.greetSomeone("Kaan", new InnerInterface() {
//            @Override
//            public void sayHello(String name) {
//                System.out.println("Hello " + name);
//            }
//        });

        // lambda expressions representation of anonymous inner class
        example.greetSomeone("Kaan", name -> System.out.println("Merhaba " + name));

        example.greetSomeone("Kaan", name -> System.out.println("Hello " + name));

    }

    private static class InnerInterfaceImpl implements InnerInterface {

        @Override
        public void sayHello(String name) {
            System.out.println("Hola " + name);
        }
    }


}
