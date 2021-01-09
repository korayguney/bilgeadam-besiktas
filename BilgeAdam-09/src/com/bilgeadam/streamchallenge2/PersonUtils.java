package com.bilgeadam.streamchallenge2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonUtils {

    public static List<Person> readFile(String path) {
        List<Person> personList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(new File(path));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(" ");
                personList.add(new Person(arr[0], arr[1], Integer.valueOf(arr[2])));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personList;
    }


}
