package com.bilgeadam.interfaceabstractrecap;

public interface Interface2 {
    public static final String TEST = "Bilgeadam";

    public abstract double foo();

    // java 1.8+
    public default void bar(){
        System.out.println("Inside default method");
    }

    // java 1.8+
    public static void baz(){
        System.out.println("Inside static method");
    }
}
