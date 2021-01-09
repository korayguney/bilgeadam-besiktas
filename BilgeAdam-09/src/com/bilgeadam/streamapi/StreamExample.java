package com.bilgeadam.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> intArr = new ArrayList<>();
        intArr.add(78);
        intArr.add(12);
        intArr.add(7);
        intArr.add(56);
        intArr.add(35);
        intArr.add(34);
        intArr.add(69);

        System.out.println("----- Order is Important - 1 -------");
        intArr.stream().map(i -> i * 1000 * 1.2).filter(s -> s < 50000.0).forEach(a -> System.out.println(a));

        System.out.println("----- Order is Important - 2 -------");
        intArr.stream().filter(s -> s < 50000.0).map(i -> i * 1000 * 1.2).forEach(a -> System.out.println(a));


        System.out.println("------ Sorted -------");
        intArr.stream().map(i -> i * 1000 * 1.2).filter(s -> s < 50000.0).sorted().forEach(a -> System.out.println(a));

        System.out.println("------ Sorted 2 -------");
        intArr.stream().map(i -> i * 1000 * 1.2).filter(s -> s < 50000.0).sorted((o1, o2) -> (int)(o2 - o1)).forEach(a -> System.out.println(a));


        System.out.println("------ Peek -------");
        intArr.stream().map(i -> i * 1000 * 1.2).filter(s -> s < 50000.0).peek(p -> System.out.println("Peek : "+p)).sorted((o1, o2) -> (int)(o2 - o1))
                .forEach(a -> System.out.println("For each:"+a));


        System.out.println("------ limit -------");
        intArr.stream().map(i -> i * 1000 * 1.2).filter(s -> s < 50000.0).sorted((o1, o2) -> (int)(o2 - o1)).limit(2)
                .forEach(a -> System.out.println("For each:"+a));

        System.out.println("------ collect -------");
        List<Double> doubleArr = intArr.stream().map(i -> i * 1000 * 1.2).filter(s -> s < 50000.0).sorted((o1, o2) -> (int)(o2 - o1)).limit(2).collect(Collectors.toList());
        doubleArr.stream().forEach(System.out::println);


    }
}
