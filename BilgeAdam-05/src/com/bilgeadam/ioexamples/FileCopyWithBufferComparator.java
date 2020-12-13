package com.bilgeadam.ioexamples;

import java.io.*;

public class FileCopyWithBufferComparator {

    public static void main(String[] args) {

        String inputFile = "D:/BilgeAdam/BEŞİKTAŞ-GRUP/test-io/nasa.jpg";
        String outputFile = "D:/BilgeAdam/BEŞİKTAŞ-GRUP/test-io/nasa-copy.jpg";

        File file = new File(inputFile);
        System.out.println("File has the lenght of " + file.length() + " bytes");

        int[] byteOfPackages = {1, 2, 4, 8, 16, 32, 64, 128, 256, 1024, 2048};

        InputStream inputStream = null;
        OutputStream outputStream = null;

        long startTime, finishTime;

        try {

            for (int i = 0; i < byteOfPackages.length; i++) {
                byte[] byteSize = new byte[byteOfPackages[i] * 1024];

                // Open streams
                inputStream = new FileInputStream(inputFile);
                outputStream = new FileOutputStream(outputFile);

                int readByte;

                startTime = System.nanoTime();

                // read & write streams
                while ((readByte = inputStream.read(byteSize)) != -1){
                    outputStream.write(byteSize, 0, readByte);
                }

                finishTime = System.nanoTime();

                System.out.println(byteOfPackages[i] + " KB: " + ((finishTime-startTime)/100000) + " msec");
            }
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
