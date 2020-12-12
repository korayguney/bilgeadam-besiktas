package com.bilgeadam.exceptionchallenge;

public class NotEligibleForVotingException extends Exception {
    public NotEligibleForVotingException(){

    }

    public NotEligibleForVotingException(String message){
        super(message);
    }

    public NotEligibleForVotingException(Throwable throwable){
        super(throwable);
    }

    public NotEligibleForVotingException(String message, Throwable throwable){
        super(message, throwable);
    }

}
