package com.exception;

public class EmpNotFoundException extends RuntimeException{
    public EmpNotFoundException(String message) {
        super(message);
    }
}
