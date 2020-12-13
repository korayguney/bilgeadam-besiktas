package com.bilgeadam.iosteamschallenge;


public class AttendeesChallenge {

    public static void main(String[] args) {

        String context = IOUtils.fileRead("C:\\Users\\koray\\IdeaProjects\\BilgeAdam-Besiktas\\BilgeAdam-05\\resources\\attendees.txt");
        String[] attArr = context.split("\n");

        System.out.println("The total number of attendees is " + attArr.length + " inside the classroom");

        String[] names;
        String name = "";

        for (int i = 0; i < attArr.length; i++) {
            names = attArr[i].split(" ");
            name += names[0].toUpperCase()+"\n";
        }

        IOUtils.fileWrite(name, "C:\\Users\\koray\\IdeaProjects\\BilgeAdam-Besiktas\\BilgeAdam-05\\resources\\attendees-output.txt");
        IOUtils.close();

        System.out.println("All operations finished");
    }
}
