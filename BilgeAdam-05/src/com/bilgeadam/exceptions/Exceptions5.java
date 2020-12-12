package com.bilgeadam.exceptions;

public class Exceptions5 {
    static String[] strArr;

    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException (Unchecked exp.)
       // int[] anArray = new int[3];
       // System.out.println(anArray[3]);

        // NullPointerException (Unchecked exp.)
        strArr = new String[3];
        for (String s:strArr) {
            System.out.println(s);
        }

      //  foo(strArr);


        // NumberFormatException (Unchecked exp.)
        int result = Integer.parseInt("abc");
        System.out.println(result);

    }

    public static void foo(String[] strArr){
       bar(strArr);
    }

    public static void bar(String[] strArr){
        System.out.println(strArr[0].length());
    }

}
