package com.bilgeadam.streamchallenge2;

import com.sun.org.apache.bcel.internal.generic.SIPUSH;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonStreamTest {

    public static void main(String[] args) {

        List<Person> students = PersonUtils.readFile("C:\\Users\\koray\\IdeaProjects\\BilgeAdam-Besiktas\\BilgeAdam-09\\students.txt");
        Stream<Person> mystream = students.stream();
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

        /*
        Calculate the average age of the persons in the class and write to the console
         */
        System.out.println("============4=================");
        Double result = students.stream().collect(Collectors.averagingDouble(Person::getAge));
        System.out.println("Average age : " + result);

        double result2 = students.stream().mapToDouble(p -> p.getAge()).average().getAsDouble();
        System.out.println("Average age 2: " + result2);

        IntSummaryStatistics result3 = students.stream().collect(Collectors.summarizingInt(Person::getAge));
        System.out.println("Average age 3: " + result3.getAverage());

        /*
        Group persons according to their ages and write to the console in below format;
            age 18: [Ali Veli, Ayşe Güneş]
            age 35: [Koray Güney]
         */
        System.out.println("============5=================");
        Map<Integer, List<Person>> groupedStudent = mystream.collect(Collectors.groupingBy(Person::getAge));
        groupedStudent.forEach((age, p) -> System.out.printf("\nAge %d : %s", age, p));



    }

    private static String getPersonNameAndAge(Person p) {
        return p.getFirstName() + " ---> " + p.getAge();
    }
}


