package com.bilgeadam.anonymousrecap;

public class AnonymousTest {

    public static void main(String[] args) {
        // Anonymous inner (nested) class
        double result = calculate(new Calculatable() {
            @Override
            public double multiply(double a, double b) {
                return a * b;
            }
        }, 10, 5);

        // lambda expression
        result = calculate((a, b) -> a * b, 12.6, 5.3);

        System.out.println("Result = " + result);
    }

    public static double calculate(Calculatable c, double a, double b){
        return c.multiply(a, b);
    }
}
