package com.capg.demo.demospringboot.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.demospringboot.model.User;

@RestController
@RequestMapping("/api")
public class UserRestController {
	@GetMapping("/users")
	public User getUser() {
		User user=new User("Rebeca", "rebeca@gmail.com", 
				LocalDate.of(1999, 04, 16), 98765436546L);
		return user;
	}
}
