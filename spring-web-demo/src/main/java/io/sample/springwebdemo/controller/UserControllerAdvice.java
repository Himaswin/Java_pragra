package io.sample.springwebdemo.controller;


import io.sample.springwebdemo.Entity.Error;
import io.sample.springwebdemo.exception.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Error> handleUserNotFoundException(Exception e){
        return ResponseEntity.status(404).body(Error.builder().message("user not found").code("not found 404").build());
    }

    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<Error> handleBadRequest(Exception e){
        return ResponseEntity.status(404).body(Error.builder().message("user not found").code("not found 404").build());
    }
}
