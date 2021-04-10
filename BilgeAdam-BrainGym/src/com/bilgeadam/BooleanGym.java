package com.bilgeadam;

public class BooleanGym {
    public static void main(String[] args) {

        boolean input1 = true, input2 = false;  // Line 1

        boolean result1 = input1 = !input1; // Line 2

        boolean result2 = input2 = input1;  // Line 3

        boolean result3 = input1 == (result1=!input2);  // Line 4

        System.out.println(input1+" " +input2 + " " +  result2 + " " + result3);
    }
}