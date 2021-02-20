package com.bilgeadam.exceptions;

import javax.persistence.NoResultException;

public class CustomerDoesNotExistOnDbException extends NoResultException {
    public CustomerDoesNotExistOnDbException(){
        super();
    }

    public CustomerDoesNotExistOnDbException(String message){
        super(message);
    }

}
