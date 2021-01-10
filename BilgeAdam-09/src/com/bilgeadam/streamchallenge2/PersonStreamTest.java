package com.bilgeadam.streamchallenge2;

import com.sun.org.apache.bcel.internal.generic.SIPUSH;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonStreamTest {

    public static void main(String[] args) {

        List<Person> students = PersonUtils.readFile("C:\\Users\\koray\\IdeaProjects\\BilgeAdam-Besiktas\\BilgeAdam-09\\students.txt");

        // write all person’s information to the console
        System.out.println("============1=================");
        students.stream().forEach(System.out::println);

        /*
        Filter persons whose ages are greater than 22 and write only
        their firstnames in CAPITAL letters to the console
         */
        System.out.println("============2=================");
        students.stream().filter(p -> p.getAge() > 22).map(p -> p.getFirstName().toUpperCase()).
                forEach(s -> System.out.println(s));


        /*
        Sort first 3 persons according to their ages from younger to older
        and write in below format to the console (Koray ---> 35)
         */
        System.out.println("============3=================");
        students.stream().sorted(Comparator.comparingInt(Person::getAge)).limit(3).
                map(p -> p.getFirstName() +" ---> " + p.getAge()).forEach(s -> System.out.println(s));

        //students.stream().sorted().limit(3).map(PersonStreamTest::getPersonNameAndAge).forEach(System.out::println);



    }

    private static String getPersonNameAndAge(Person p) {
        return p.getFirstName() + " ---> " + p.getAge();
    }
}


