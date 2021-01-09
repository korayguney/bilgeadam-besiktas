package com.bilgeadam.streamchallenge1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamChallenge1 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "acd", "", "defg", "jk");
        // Count the empty strings
        long result = strList.stream().filter(s -> s.isEmpty()).count();
        System.out.println("Count of the empty strings : " + result);

        // Count String with length more than 3
        result = strList.stream().filter(s -> s.length() > 3).count();
        System.out.println("Count String with length more than 3 : " + result);

        // Count number of String which starts with "a"
        result = strList.stream().filter(s -> s.startsWith("a")).count();
        System.out.println("Count number of String which starts with \"a\" : " + result);

        // Remove all empty Strings from List
        List<String> arr = strList.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        arr.forEach(s -> System.out.println("Remove all empty Strings from List : "+s));

        // Create a List with String more than 2 characters
        arr = strList.stream().filter(s -> s.length() > 2).collect(Collectors.toList());
        arr.forEach(s -> System.out.println("Create a List with String more than 2 characters : "+s));

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        // Convert String to Uppercase and join them using comma
        String G7countries =G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println("G7countries : " + G7countries);

        Optional<String> str = G7.stream().map(x -> x.toUpperCase()).reduce((s, s2) -> s +", " +s2);
        str.ifPresent(System.out::println);

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        // Create List of square of all distinct numbers
        numbers = numbers.stream().map(s -> s * s).distinct().collect(Collectors.toList());
        numbers.forEach(s-> System.out.println("List of square of all distinct numbers : " + s));

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        //Get count, min, max, sum, and average for numbers
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Stats of list : \n" + stats.toString());


    }


}
