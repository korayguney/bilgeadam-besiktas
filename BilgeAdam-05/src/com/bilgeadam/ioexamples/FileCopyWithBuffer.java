package com.bilgeadam.ioexamples;

import java.io.*;

public class FileCopyWithBuffer {

    public static void main(String[] args) {

        String inputFile = "D:/BilgeAdam/BEŞİKTAŞ-GRUP/test-io/nasa.jpg";
        String outputFile = "D:/BilgeAdam/BEŞİKTAŞ-GRUP/test-io/nasa-copy.jpg";

        File file = new File(inputFile);
        System.out.println("File has the lenght of " + file.length() + " bytes");

        InputStream inputStream = null;
        OutputStream outputStream = null;

        long startTime, finishTime;

        try {
            // Open streams
            inputStream = new FileInputStream(inputFile);
            outputStream = new FileOutputStream(outputFile);

            int readByte;
            byte[] byteArr = new byte[64];

            startTime = System.nanoTime();

            // read & write streams
            while ((readByte = inputStream.read(byteArr)) != -1){
                outputStream.write(byteArr, 0, readByte);
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
