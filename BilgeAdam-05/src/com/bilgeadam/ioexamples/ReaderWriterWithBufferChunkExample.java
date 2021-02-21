package com.bilgeadam.ioexamples;

import java.io.*;

public class ReaderWriterWithBufferChunkExample {

    public static void main(String[] args) {
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader(new File("BilgeAdam-05\\resources\\story.txt"));
            writer = new FileWriter(new File("BilgeAdam-05\\resources\\story-copy.txt"));

            int readByte;
            long count = 0;
            char[] charArr = new char[128];

            while((readByte = reader.read(charArr)) != -1){
                writer.write(charArr, 0, readByte);
                count += readByte;
            }

            System.out.println("Read count : " + count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
