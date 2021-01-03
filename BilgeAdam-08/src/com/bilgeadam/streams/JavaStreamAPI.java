package com.bilgeadam.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaStreamAPI {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Hasan");
        names.add("Mustafa");
        names.add("Mehmet");
        names.add("Zeynep");
        names.add("Kemal");
        names.add("Hüseyin");
        names.add("Kamil");
        names.add("Kamil");
        names.add("Kamil");
        names.add("Kamil");
        names.add("Jale");
        names.add("Emrah");
        names.add("Osman");
        names.add("Osman");
        names.add("Osman");
        names.add("Osman");

        System.out.println("----- FILTER ------");

        /* anonymous inner class
        names.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                System.out.println("In the filter method : " + s);
                return s.length() > 5;
            }
        }).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("M") || s.startsWith("H");
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("In the forEach method : " + s);
            }
        });

         */

        // lambda expressions
        names.stream().filter(s -> s.length() > 5).filter(s -> s.startsWith("M") || s.startsWith("H")).forEach(System.out::println);

        System.out.println("----- MAP ------");
        /* anonymous inner class
        names.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                System.out.println("In the map method " + s);
                return new Student(s);
            }
        }).filter(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                System.out.println("In the filter method " + student.getName());
                return student.getName().equals("Zeynep");
            }
        }).forEach(System.out::println);,

         */

        // lambda expressions
        names.stream().map(s -> new Student(s)).filter(s -> s.getName().equals("Zeynep")).forEach(System.out::println);

        /*
        List<Student> students = new ArrayList<>();
        for (String name : names) {
            if(name.equals("Zeynep")){
                students.add(new Student(name));
                System.out.println(name);
            }
        }
         */

        System.out.println("----- DISTINCT ------");
        names.stream().distinct().forEach(s -> System.out.println(s));

        System.out.println("----- LIMIT ------");
        names.stream().limit(1).forEach(s -> System.out.println(s));

        System.out.println("----- PEEK ------");
        names.stream().filter(s -> s.length() > 5).peek(s -> System.out.println("Peek : " + s)).filter(s -> s.startsWith("M") || s.startsWith("H")).forEach(System.out::println);

        System.out.println("----- SORTED ------");
        //names.stream().distinct().sorted().forEach(s -> System.out.println(s));
        names.stream().distinct().sorted((o1, o2) -> o2.compareTo(o1)).forEach(s -> System.out.println(s));

        System.out.println("----- ANYMATCH ------");
        boolean res = names.stream().distinct().sorted((o1, o2) -> o2.compareTo(o1)).anyMatch(s -> s.startsWith("M"));
        System.out.println(res);

        System.out.println("-----ALLMATCH ------");
        boolean res1 = names.stream().distinct().sorted((o1, o2) -> o2.compareTo(o1)).allMatch(s -> s.startsWith("M"));
        System.out.println(res1);

        System.out.println("-----COLLECT ------");
        List<String> filteredNames = names.stream().filter(s -> s.startsWith("M")).distinct().collect(Collectors.toList());
        for (String filteredName : filteredNames) {
            System.out.println("Filtered name : " + filteredName);
        }

        System.out.println("----- COUNT ------");
        long count1 = names.stream().distinct().count();
        long count2 = names.stream().count();

        System.out.println("The duplicated string number is " + (count2 - count1));

        System.out.println("----- MAX ------");
        Optional<String> max_res = names.stream().distinct().max((o1, o2) -> o1.compareTo(o2));
        max_res.ifPresent(s -> System.out.println(s));

        System.out.println("----- MIN ------");
        Optional<String> min_res = names.parallelStream().distinct().min((o1, o2) -> o1.compareTo(o2));
        min_res.ifPresent(s -> System.out.println(s));

        System.out.println("----- REDUCE ------");
        Optional<String> reduce_res = names.stream().distinct().reduce((s, s2) -> s.concat(s2));
        reduce_res.ifPresent(s -> System.out.println(s));

    }


}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}