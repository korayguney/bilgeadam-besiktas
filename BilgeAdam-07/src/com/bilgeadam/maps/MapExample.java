package com.bilgeadam.maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new TreeMap<>();

        myMap.put("Fenerbahce", 45);
        myMap.put("Galatasaray", 42);
        myMap.put("Beşiktaş", 40);
        myMap.put("Trabzonspor", 35);

        int fenerbahcePoint = myMap.get("Fenerbahce");
        System.out.println(fenerbahcePoint);
        System.out.println("-------------------");
        for (Integer integer : myMap.values()) {
            System.out.println(integer);
        }

        System.out.println("-------------------");
        Set<String> keys = myMap.keySet();
        keys.forEach(s -> System.out.println(s));

        System.out.println("-------------------");
        for (Entry<String,Integer> entry: myMap.entrySet()) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }


    }



}
