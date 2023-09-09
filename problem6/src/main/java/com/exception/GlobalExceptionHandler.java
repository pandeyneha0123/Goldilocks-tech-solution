package com.exception;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmpNotFoundException.class)
    public ResponseEntity<Error> EmployeeExceptionHandler( EmpNotFoundException empNotFoundException , WebRequest rst){

        Error e = new Error();
        e.setTimestamp(LocalDateTime.now());
        e.setMessage(empNotFoundException.getMessage());
        e.setDetails(rst.getDescription(false));

        return new ResponseEntity<Error>(e, HttpStatus.BAD_REQUEST);

    }
}
