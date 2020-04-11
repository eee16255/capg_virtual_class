package com.capg.demo.demospring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class ErrorController {
	
	
		
		@ExceptionHandler(Exception.class)
		@ResponseStatus(code=HttpStatus.NOT_FOUND,reason = "Student Not Found", value = HttpStatus.NOT_FOUND)
		public void handleError() {
			
		}
}
