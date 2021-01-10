package com.bilgeadam.streamapi3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFromFile {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\koray\\IdeaProjects\\BilgeAdam-Besiktas\\BilgeAdam-09\\students.txt");
        try {
            Stream<String> streamOfStrings = Files.lines(path);
            streamOfStrings.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
