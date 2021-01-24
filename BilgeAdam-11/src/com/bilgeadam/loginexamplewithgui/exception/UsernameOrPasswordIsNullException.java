package com.bilgeadam.loginexamplewithgui.exception;

public class UsernameOrPasswordIsNullException extends Exception {

    public UsernameOrPasswordIsNullException(){
        super();
    }

    public UsernameOrPasswordIsNullException(String message){
        super(message);
    }

    public UsernameOrPasswordIsNullException(Throwable throwable){
        super(throwable);
    }

    public UsernameOrPasswordIsNullException(String message, Throwable throwable){
        super(message, throwable);
    }


}
