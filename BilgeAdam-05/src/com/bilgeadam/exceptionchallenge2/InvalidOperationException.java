package com.bilgeadam.exceptionchallenge2;

public class InvalidOperationException extends Exception{

    public InvalidOperationException(){

    }

    public InvalidOperationException(String message){
        super(message);
    }

    public InvalidOperationException(Throwable throwable){
        super(throwable);
    }

    public InvalidOperationException(String message, Throwable throwable){
        super(message, throwable);
    }
}
