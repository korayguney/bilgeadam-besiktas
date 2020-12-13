package com.bilgeadam.iosteamschallenge;

import java.io.*;

public class IOUtils {
    private static BufferedReader bufferedReader = null;
    private static BufferedWriter bufferedWriter = null;

    public static String fileRead(String path) {
        String context = "";

        try {
            bufferedReader = new BufferedReader(new FileReader(new File(path)));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                context += line + "\n";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return context;
    }

    public static void fileWrite(String context, String path) {

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path));
            bufferedWriter.write(context);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void close(){
        try {
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
