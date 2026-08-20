package com.example.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping	
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "David", "david@gmail.com", "999999999", "adm123");
		return ResponseEntity.ok().body(u);
	} 
}
