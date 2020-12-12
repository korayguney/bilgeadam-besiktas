package com.bilgeadam.assertinfo;

public class AssertionTest {
    public static void main(String[] args) {
        int number = -5;    // assumed number is not negative
        assert (number >= 0) : "number is negative: " + number;
        System.out.println("The number is " + number);
    }
}
