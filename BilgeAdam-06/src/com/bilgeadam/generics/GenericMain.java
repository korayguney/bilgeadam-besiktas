package com.bilgeadam.generics;

import java.util.ArrayList;

public class GenericMain {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(22);
        //arr.add("Bilgeadam");
        arr.add(33);
        arr.add(44);
        arr.add(44);

        printDouble(arr);

    }

    private static void printDouble(ArrayList<Integer> arr) {
        for (int i: arr) {
            System.out.println(i * 2);
        }

    }


}
