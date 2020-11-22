package com.bilgeadam.calculatorexample;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum2(1,2));

       int sumResult = Calculator.sum(10 ,20);
       int subsResult = Calculator.subtract(20,5);
       double divideResult = Calculator.divide(15,3);
       int multResult = Calculator.multiply(10,5);
       double powResult = Calculator.pow(10,3);

        System.out.println("SUM : " + sumResult);
        System.out.println("SUBSTRACT : " + subsResult);
        System.out.println("DIVIDE : " + divideResult);
        System.out.println("MULTIPLY : " + multResult);
        System.out.println("POW : " + powResult);

        System.out.println("Test Test");

    }
}
