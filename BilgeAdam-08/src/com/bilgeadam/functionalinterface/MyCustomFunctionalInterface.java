package com.bilgeadam.functionalinterface;

@FunctionalInterface
public interface MyCustomFunctionalInterface {

    void test(int a);

    static void testStatic(){

    }

    default void testDeafult(){

    }

}
