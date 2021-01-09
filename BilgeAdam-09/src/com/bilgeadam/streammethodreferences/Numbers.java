package com.bilgeadam.streammethodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 5, 45, 56, 23);

        // anonymous class
        findNumbers(list, new BiPredicate<Integer, Integer>() {
            @Override
            public boolean test(Integer i1, Integer i2) {
                return Numbers.isMoreThenFifty(i1, i2);
            }
        });//.forEach(s -> System.out.println(s));

        // lambda expressions
        findNumbers(list, (i1, i2) -> Numbers.isMoreThenFifty(i1, i2));//.forEach(s -> System.out.println(s));

        // Method references
        findNumbers(list, Numbers::isMoreThenFifty).forEach(System.out::println);

    }

    public static List<Integer> findNumbers(List<Integer> l, BiPredicate<Integer, Integer> p) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : l) {
            if (p.test(i, i + 10)) {
                newList.add(i);
            }
        }
        return newList;

    }

    public static boolean isMoreThenFifty(int n1, int n2) {
        return (n1 + n2) > 50;
    }

}
