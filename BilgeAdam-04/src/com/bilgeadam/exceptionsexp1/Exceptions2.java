package com.bilgeadam.exceptionsexp1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Exceptions2 {

    public static void main(String[] args) throws FileNotFoundException
    {

        try {
            InputStream in = new FileInputStream("missingfile.txt");
        } catch (FileNotFoundException e ){
            //e.printStackTrace();
            System.out.println("Inside catch block");
        } catch (NullPointerException n){

        }




        //InputStream in = new FileInputStream("missingfile.txt");
        System.out.println("Test test");

    }


}
