package com.bilgeadam.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> strArray = new ArrayList<>();
        List<String> strArray2 = new ArrayList<>();
        strArray.add("Koray");
        strArray.add("Kaan");
        strArray.add("Sefa");
        strArray.add("Furkan");
        strArray2.add("Veli");
        strArray2.add("Faik Mert");

        System.out.println("There are " + strArray.size() + " person");
        for (String s : strArray) {
            System.out.println(s);
        }

        strArray.addAll(strArray2);
        System.out.println("********************************");
        strArray.remove(5);
        System.out.println("There are " + strArray.size() + " person");
        for (String s : strArray) {
            System.out.println(s);
        }

        System.out.println("********************************");
        System.out.println("Is exists ? " + strArray.contains("Koray"));

        System.out.println("********************************");
        String str = strArray.get(1);
        System.out.println(str);

        System.out.println("********************************");
        System.out.println(strArray.indexOf("Veli"));

        System.out.println("********************************");
        strArray.set(3, "hasan");

        System.out.println("There are " + strArray.size() + " person");
        for (String s : strArray) {
            System.out.println(s);
        }
        System.out.println("********************************");
        String[] arr1 = (String[]) strArray.toArray();

        System.out.println("********************************");

        strArray.clear();
        System.out.println("There are " + strArray.size() + " person");


    }


}
