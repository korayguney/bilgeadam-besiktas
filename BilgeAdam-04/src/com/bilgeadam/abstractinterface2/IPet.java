package com.bilgeadam.abstractinterface2;

public interface IPet {

    String getName();
    void setName(String name);
    void play();

    // java 1.8+
    default void testDefault(){
        System.out.println("Inside default method");
    }

    static void testStatic(){
        System.out.println("Inside static method");
    }
}
