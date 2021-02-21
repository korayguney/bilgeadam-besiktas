package com.bilgeadam.ioexamples;

import java.io.*;

public class FileCopyWithBufferAutoCloseable {

    public static void main(String[] args) {

        String inputFile = "BilgeAdam-05/resources/nasa.jpg";
        String outputFile = "BilgeAdam-05/resources/nasa-copy.jpg";

        File file = new File(inputFile);
        System.out.println("File has the lenght of " + file.length() + " bytes");

        long startTime, finishTime;

        try (
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inputFile));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outputFile));
        ) {
            // Open streams


            int readByte;

            startTime = System.nanoTime();

            // read & write streams
            while ((readByte = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(readByte);
            }

            finishTime = System.nanoTime();

            System.out.println("File is copied to --> " + outputFile);
            System.out.println("Copy operation is elapsed : " + ((finishTime - startTime) / 1000000) + " msec");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
