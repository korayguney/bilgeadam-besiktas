package com.bilgeadam.exceptions;

public class DosyaBulunamadiException extends Exception {

    public DosyaBulunamadiException(){

    }

    public DosyaBulunamadiException(String message){
        super(message);
    }

    public DosyaBulunamadiException(Throwable throwable){
        super(throwable);
    }

    public DosyaBulunamadiException(String message, Throwable throwable){
        super(message, throwable);
    }


}
