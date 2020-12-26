package com.bilgeadam.setinterface;

import java.util.*;

public class SortedSetExample {

    public static void main(String[] args) {

        Set<Integer> intSet = new TreeSet<>();
        //List<Integer> intSet = new ArrayList<>();

        intSet.add(12);
        intSet.add(-56);
        intSet.add(347);
        intSet.add(645645);
        intSet.add(9);
        intSet.add(9);
        intSet.add(9);
        intSet.add(9);

        for (Integer integer : intSet) {
            System.out.println("Tree set value : " + integer);
        }


    }


}
