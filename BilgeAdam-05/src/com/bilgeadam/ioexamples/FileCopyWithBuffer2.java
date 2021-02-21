package com.bilgeadam.ioexamples;

import java.io.*;

public class FileCopyWithBuffer2 {

    public static void main(String[] args) {

        String inputFile = "BilgeAdam-05/resources/nasa.jpg"; // "./BilgeAdam-05/resources/nasa.jpg";  --> relative path
        String outputFile = "BilgeAdam-05/resources/nasa-copy.jpg";

        File file = new File(inputFile);
        System.out.println("File has the lenght of " + file.length() + " bytes");

        InputStream inputStream = null;
        OutputStream outputStream = null;

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        long startTime, finishTime;

        try {
            // Open streams
            inputStream = new FileInputStream(inputFile);
            outputStream = new FileOutputStream(outputFile);

            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            int readByte;

            startTime = System.nanoTime();

            // read & write streams
            while ((readByte = bufferedInputStream.read()) != -1){
                bufferedOutputStream.write(readByte);
            }

            finishTime = System.nanoTime();

            System.out.println("File is copied to --> " + outputFile);
            System.out.println("Copy operation is elapsed : " + ((finishTime-startTime)/1000000) + " msec");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }



}
