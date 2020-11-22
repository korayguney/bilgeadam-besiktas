package com.bilgeadam.overloading;

public class TestOverload {

    private int addInt(int a){
        return a;
    }

    private int addInt(int a, int b){
        return a+b;
    }

    private int addInt(int a, int b, String log){
        return a+b;
    }

}
