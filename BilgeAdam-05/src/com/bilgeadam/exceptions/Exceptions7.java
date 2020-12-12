package com.bilgeadam.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions7 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("C:\\Users\\koray\\IdeaProjects\\BilgeAdam-Besiktas\\BilgeAdam-05\\missingfile.txt"));) {
            System.out.println("Success comment");
           // System.out.println("1/0");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ArithmeticException e){
            e.printStackTrace();
        }

    }
}
