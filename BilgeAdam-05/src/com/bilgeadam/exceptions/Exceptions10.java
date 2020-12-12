package com.bilgeadam.exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class Exceptions10 {

    public static void main(String[] args) throws DosyaBulunamadiException {
        new Exceptions10().readFile("C:\\Users\\koray\\IdeaProjects\\BilgeAdam-Besiktas1\\BilgeAdam-05\\missingfile.txt");
    }

    public void readFile(String file) throws DosyaBulunamadiException {
        boolean found = findFile(file);

        if (!found)
            //throw new FileNotFoundException("Dosya bulunamadı");
            throw new DosyaBulunamadiException("Dosya ilgili path te bulunamadı", new Throwable("ssss"));
        else
            System.out.println("File found");
    }

    boolean findFile(String file) {
        return new File(file).exists();
    }

}
