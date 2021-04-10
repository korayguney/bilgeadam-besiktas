package com.bilgeadam;

public class StringGym {
    static String s;
    public static void main(String[] args) {

        String s;
        boolean isOk=true;
        if (isOk) s = StringGym.s+"";
        else s="";
        s.concat("Hello ");
        s.concat("World");
        s.toUpperCase();
        System.out.println("s = "+s);

    }
}