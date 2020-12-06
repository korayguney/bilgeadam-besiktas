package com.bilgeadam.exceptionsexp1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Exceptions1 {

    public static void main(String[] args) {
        try {
            System.out.println("About to open a file");
            InputStream in = new FileInputStream("missingfile.txt");
           // InputStream in = new FileInputStream("C:\\Users\\koray\\OneDrive\\Masaüstü\\missingfile.txt");
            System.out.println("File open");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //System.out.println("Something went wrong!");
        }

    }
}
