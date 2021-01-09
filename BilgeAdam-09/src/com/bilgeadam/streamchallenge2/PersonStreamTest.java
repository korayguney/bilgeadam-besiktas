package com.bilgeadam.streamchallenge2;

import com.sun.org.apache.bcel.internal.generic.SIPUSH;

import java.util.List;

public class PersonStreamTest {

    public static void main(String[] args) {

        List<Person> students = PersonUtils.readFile("C:\\Users\\koray\\IdeaProjects\\BilgeAdam-Besiktas\\BilgeAdam-09\\students.txt");

        // write all person’s information to the console
        students.stream().forEach(System.out::println);




    }
}
