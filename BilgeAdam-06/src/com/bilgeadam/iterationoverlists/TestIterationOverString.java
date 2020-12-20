package com.bilgeadam.iterationoverlists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class TestIterationOverString {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("Koray");
        strList.add("Veli");
        strList.add("Furkan");
        strList.add("Sefa");
        strList.add("Kaan");

        System.out.println("==== ENHANCED FOR ITERATION ====");
        for (String str : strList) {
            System.out.println(str);
        }

        System.out.println("==== STANDART FOR ITERATION ====");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        System.out.println("==== WHILE LOOP ITERATION ====");
        int i=0;
        while (i < strList.size()){
            System.out.println(strList.get(i));
            i++;
        }

        System.out.println("==== LIST ITERATION METHOD ====");
        Iterator<String> strIterator = strList.iterator();
        while (strIterator.hasNext()){
            System.out.println(strIterator.next());
        }

        System.out.println("==== FOREACH ITERATION ====");
        strList.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });

        System.out.println("==== FOREACH ITERATION WITH LAMBDA ====");
        strList.forEach(str -> System.out.println(str));

        System.out.println("==== FOREACH ITERATION WITH LAMBDA 2 ====");
        strList.forEach(System.out::println);


    }
}
