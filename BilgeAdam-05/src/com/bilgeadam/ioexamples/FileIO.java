package com.bilgeadam.ioexamples;

import java.io.File;
import java.io.FilenameFilter;

public class FileIO {
    public static void main(String[] args) throws InterruptedException {

        File directory1 = new File("D:\\BilgeAdam\\BEŞİKTAŞ-GRUP\\test-io");
        File directory2 = new File("D:\\BilgeAdam\\BEŞİKTAŞ-GRUP\\test-io-2");
        File file1 = new File("D:/BilgeAdam/BEŞİKTAŞ-GRUP/test-io/test.txt");
        File file2 = new File("D:/BilgeAdam/BEŞİKTAŞ-GRUP/test-io/test2.txt");
        File image1 = new File("D:/BilgeAdam/BEŞİKTAŞ-GRUP/test-io/fb.jpg");
        File image2 = new File("D:/BilgeAdam/BEŞİKTAŞ-GRUP/test-io/gs.jpg");

        System.out.println("Is directory exists? : " + directory1.exists());
        System.out.println("Is txt exists? : " + file1.exists());
        System.out.println("Is image 1 exists? : " + image1.exists());
        System.out.println("Is image 2 exists? : " + image2.exists());

        System.out.println("-----------------------------------");

        System.out.println("Lenght of directory : " + directory1.length() + " bytes");
        System.out.println("Lenght of txt : " + file1.length() + " bytes");
        System.out.println("Lenght of image : " + image1.length() + " bytes");

        System.out.println("-----------------------------------");

        System.out.println("Is directory ? : " + directory1.isDirectory()); // true
        System.out.println("Is file ? : " + directory1.isFile()); // false

        System.out.println("-----------------------------------");

        System.out.println("Is directory can be readable? : " + directory1.canRead());
        System.out.println("Is directory can be writable? : " + directory1.canWrite());
        System.out.println("Is txt can be readable? : " + file1.canRead());
        System.out.println("Is txt can be writable? : " + file1.canWrite());

        System.out.println("-----------------------------------");

       // System.out.println("Is txt deleted? : " + file1.delete());
        System.out.println("Txt 2 will be deleted");
        file2.deleteOnExit();
        //Thread.sleep(5000);
        System.out.println("Txt 2 deleted");

        System.out.println("-----------------------------------");
        System.out.println("Is image renamed? "+image1.renameTo(image2));

        System.out.println("-----------------------------------");

        System.out.println("Is directory created? "+directory2.mkdir());

        System.out.println("-----------------------------------");

        String[] arr1 = directory1.list();

        for (String s : arr1) {
            System.out.println(s);
        }

        System.out.println("-----------------------------------");

        String[] arr2 = directory1.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });

        for (String s : arr2) {
            System.out.println(s);
        }


    }

}
