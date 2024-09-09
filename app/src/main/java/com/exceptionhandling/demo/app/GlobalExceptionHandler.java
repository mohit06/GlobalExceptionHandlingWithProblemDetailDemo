package com.exceptionhandling.demo.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ArithmeticException.class)
    public ResponseEntity<ProblemDetail> handleArthmaticException(ArithmeticException ex){

        HashMap<String,Object> map = new HashMap<>();
        map.put("String one","value 1");
        map.put("String two","value 2");
        map.put("String three","value 3");

        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        problemDetail.setTitle("ArithmaticException occured");
        problemDetail.setDetail(ex.getMessage());
        problemDetail.setProperties(map);
        problemDetail.setProperty("String four", "value 4");

        return new ResponseEntity<ProblemDetail>(problemDetail, HttpStatus.INTERNAL_SERVER_ERROR);


    }

}
