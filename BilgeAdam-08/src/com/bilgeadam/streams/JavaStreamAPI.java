package com.bilgeadam.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class JavaStreamAPI {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Hasan");
        names.add("Mustafa");
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