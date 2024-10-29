package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.web.models.User;
import com.web.services.interfaces.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService _userService;
	
	@PostMapping("/user")
	public  User createUser(@RequestBody User user) {
		var d = _userService.create(user);
		return d;
	}
	
	@GetMapping("/user{id}")
	public User getUser(@RequestParam Long id) {
		return _userService.getUserById(id);
	}
	
	@GetMapping("/user")
	public User getUserByEmailAndPassword(@RequestParam String email, @RequestParam String password) {
		return _userService.getUser(email, password);
	}
	
}
