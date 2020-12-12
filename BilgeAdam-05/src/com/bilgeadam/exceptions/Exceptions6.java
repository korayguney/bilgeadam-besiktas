package com.bilgeadam.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions6 {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("C:\\Users\\koray\\IdeaProjects\\BilgeAdam-Besiktas\\BilgeAdam-05\\missingfile.txt"));
            System.out.println("Success comment");
           // System.out.println("1/0");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ArithmeticException e){
            e.printStackTrace();
        } finally {
            if(scanner != null){
                scanner.close();
                System.out.println("Scanner is closed");
            } else {
                System.out.println("Scanner is ALREADY closed");
            }
        }


    }
}
