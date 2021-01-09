package com.bilgeadam.anonymousrecap;

@FunctionalInterface
public interface Calculatable {
    double multiply(double a, double b);

    default double multiply2(double a, double b){
        return 1.0;
    }

    static double multiply3(){
        return 1.0;
    }
}
