package com.bilgeadam.exceptionsexp1;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions4 {
    public static void main(String[] args) {
        System.out.println("Entered main()");
        try{
            methodA();
        } catch (FileNotFoundException f){
            System.out.println("No file is found");
        }
        System.out.println("Exit from main()");
    }

    public static void methodA() throws FileNotFoundException{
        System.out.println("Entered methodA()");
        methodB();
        System.out.println("Exit from methodA()");
    }

    public static void methodB() throws FileNotFoundException {
        System.out.println("Entered methodB()");
        methodC();
        System.out.println("Exit from methodB()");
    }

    public static void methodC() throws FileNotFoundException {
        System.out.println("Entered methodC()");
        Scanner scanner = new Scanner(new File("aaaa.txt"));
        System.out.println("Exit from methodC()");

    }

}
