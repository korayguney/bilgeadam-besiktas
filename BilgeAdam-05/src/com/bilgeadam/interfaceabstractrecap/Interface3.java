package com.bilgeadam.interfaceabstractrecap;

public interface Interface3 {
    public static final String TEST = "Bilgeadam";

    public abstract double foo1();

    // java 1.8+
    public default void bar(){
        System.out.println("Inside default method");
    }

    // java 1.8+
    public static void baz(){
        System.out.println("Inside static method");
    }
}
