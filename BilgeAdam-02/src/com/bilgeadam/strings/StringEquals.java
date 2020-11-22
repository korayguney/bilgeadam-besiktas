package com.bilgeadam.strings;

public class StringEquals {
    public static void main(String[] args) {
        // String literals [Common Pool]
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        // text
        if(str1.equals(str2)){
            System.out.println("str1 and str2 is equal");
        } else {
            System.out.println("str1 and str2 is NOT equal");
        }

        // memory space ID
        if(str1 == str2){
            System.out.println("str1 and str2 is equal");
        } else {
            System.out.println("str1 and str2 is NOT equal");
        }

        System.out.println("---------------------------------");
        // text
        if(str3.equals(str4)){
            System.out.println("str3 and str4 is equal");
        } else {
            System.out.println("str3 and str4 is NOT equal");
        }

        // memory space ID
        if(str3 == str4){
            System.out.println("str3 and str4 is equal");
        } else {
            System.out.println("str3 and str4 is NOT equal");
        }



    }




}
