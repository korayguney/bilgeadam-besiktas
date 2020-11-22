package com.bilgeadam.mainmethod;

public class MainClass {
    public static void main(String[] args) {
        if(args.length > 0) System.out.println("There are arguments");

        for (String s: args) {
            System.out.println("One of the argument is " + s);
        }

    }


}
