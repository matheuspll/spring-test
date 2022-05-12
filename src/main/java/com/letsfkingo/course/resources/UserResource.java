package com.letsfkingo.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsfkingo.course.entities.User;


@RestController
@RequestMapping(value = "/users") // Controller to response in users path
public class UserResource {
		
	@GetMapping // indica que é um metodo que responde uma requisição do tipo GET HTTP
	public ResponseEntity<User> findAll() { // ENDPOINT method to access and return users (specific type Spring to return responses)
		User u = new User(1L, "Matheus", "matheus@gmail.com", "3333-2222", "1234"); // instance user
		return ResponseEntity.ok().body(u); // method to return successfully
	}
}
