package com.bilgeadam.exceptionexp1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions6 {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("missingfile.txt"));
            System.out.println("Success comment");
           // System.out.println("1/0");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ArithmeticException e){
            e.printStackTrace();
        } finally {
            System.out.println("Inside finally block");
        }


    }
}
