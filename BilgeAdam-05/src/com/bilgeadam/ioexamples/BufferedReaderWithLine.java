package com.bilgeadam.ioexamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderWithLine {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("BilgeAdam-05\\resources\\test.txt")));

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();


    }
}
