package com.bilgeadam.customexceptions;

public class InvalidPasswordException extends Exception {

    public InvalidPasswordException(){
        super();
    }

    public InvalidPasswordException(String message){
        super(message);
    }

    public InvalidPasswordException(Throwable throwable){
        super(throwable);
    }

    public InvalidPasswordException(String message, Throwable throwable){
        super(message, throwable);
    }



}
