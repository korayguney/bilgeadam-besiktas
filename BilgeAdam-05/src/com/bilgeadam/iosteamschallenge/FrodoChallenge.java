package com.bilgeadam.iosteamschallenge;

public class FrodoChallenge {

    public static void main(String[] args) {

        String context = IOUtils.fileRead("./BilgeAdam-05/resources/frodo.txt");
        String[] textLines = context.split("\n");

        int count = 0;
        int totalcount = 0;

        for (int i = 0; i < textLines.length; i++) {
            for (char c : textLines[i].toCharArray()) {
                if(c == 'a' || c == 'e' || c == 'i' || c == 'u' ||  c == 'o'){
                    count++;
                }
            }
            System.out.println("Sentence " + (i+1) + " has " + count + " vowels");
            totalcount += count;
            count = 0;
        }

        IOUtils.fileWrite("The total number of vowels are " + totalcount, "./BilgeAdam-05/resources/frodo-output.txt" );
        IOUtils.close();

        System.out.println("Finished");

    }


}
