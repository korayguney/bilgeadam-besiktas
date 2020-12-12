package com.bilgeadam.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions8 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("C:\\Users\\koray\\IdeaProjects\\BilgeAdam-Besiktas\\BilgeAdam-05\\missingfile.txt"));) {
            System.out.println("Success comment");
           // System.out.println("1/0");
        } catch (FileNotFoundException | ArithmeticException e) {
            e.printStackTrace();
        }

    }
}
