package com.example.mongorelations.exceptions.customs;

public class ExistingResourceException extends RuntimeException{
    public ExistingResourceException(String message) {
        super(message);
    }
}
