package com.bilgeadam.setinterface;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        //Set<String> setExample = new LinkedHashSet<>(); // get elements with inserted order [one null value is accepted]
        //Set<String> setExample = new TreeSet<>(); // get elements with comparable order [any null value is permitted]
        Set<String> setExample = new HashSet<>(); // get elements with random order [one null value is accepted]

        setExample.add("Bilge");
        setExample.add("Adam");
        setExample.add("Kadıköy");
        setExample.add("Beşiktaş");
        setExample.add("ankara");
        setExample.add("istanbul");
        setExample.add("Diyarbakır");
        setExample.add("Diyarbakır");
        setExample.add("Diyarbakır");
        setExample.add("Diyarbakır");
        setExample.add("Diyarbakır");
        setExample.add("Diyarbakır");
        //setExample.add(null);


        System.out.println("Size of set array : " + setExample.size());

        Iterator<String> iterator = setExample.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---------------------------");
        for (String s : setExample) {
            System.out.println(s.hashCode() + " " + s);
        }


    }
}
