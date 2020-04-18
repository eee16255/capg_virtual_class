package com.capg.demo.demospring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.demo.demospring.exception.StudentNotFoundException;
//@RestControllerAdvice
public class ErrorController {
	@ExceptionHandler(StudentNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "User Not Found" , code = HttpStatus.NOT_FOUND)
	public void handleUserNotFoundException() {
		
	}
}
