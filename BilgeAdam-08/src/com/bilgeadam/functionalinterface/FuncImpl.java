package com.bilgeadam.functionalinterface;

public class FuncImpl implements MyCustomFunctionalInterface {
    @Override
    public void test(int a) {
        System.out.println("My number is " + a);
    }

    public static void main(String[] args) {
        new FuncImpl().test(100);
    }
}
