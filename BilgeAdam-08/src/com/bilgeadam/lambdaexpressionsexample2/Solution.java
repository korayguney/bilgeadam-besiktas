package com.bilgeadam.lambdaexpressionsexample2;

import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {

        MyMath ob = new MyMath();

        PerformOperation op;
        boolean ret = false;
        String console_log;
        int num = 1011;

        op = ob.isOdd();
        ret = ob.checker(op, num);
        console_log = ret ? "ODD" : "EVEN";
        System.out.println(console_log);

        op = ob.isPrime();
        ret = ob.checker(op, num);
        console_log = ret ? "PRIME" : "NOT PRIME";
        System.out.println(console_log);

        op = ob.isPalindrome();
        ret = ob.checker(op, num);
        console_log = ret ? "PALINDROME" : "NOT PALINDROME";
        System.out.println(console_log);


    }
}

class MyMath {
    public static boolean checker(PerformOperation p, int num){
        return p.check(num);
    }

    public static PerformOperation isOdd(){
        /*
        PerformOperation po = new PerformOperation() {
            @Override
            public boolean check(int a) {
                return a % 2 != 0;
            }
        };
                return po;

         */
        return a -> a % 2 != 0;
    }

    public static PerformOperation isPrime(){
        new PerformOperation(){
            @Override
            public boolean check(int a) {
                return BigInteger.valueOf(a).isProbablePrime(1);
            }
        };
       return a -> BigInteger.valueOf(a).isProbablePrime(1);
    }

    public static PerformOperation isPalindrome(){
        return a -> Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
    }
}


@FunctionalInterface
interface PerformOperation {
    boolean check(int a);
}
