package com.bilgeadam.pasbyvalue;

public class TestPassByValue {
    public static void main(String[] args) {
        int localvalue = 5;
        calculate(localvalue);
        System.out.println("Local value is " + localvalue);
    }

    private static void calculate(int localvalue) {
        localvalue = localvalue * 100;
    }
}
