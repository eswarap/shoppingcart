package com.example.ecommerce.shoppingcart.controller;

import javax.validation.constraints.NotNull;

import com.example.ecommerce.shoppingcart.model.User;
import com.example.ecommerce.shoppingcart.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/api/users")
public class UserController {

    @Autowired
	private UserService userService;
	
	@GetMapping(value = { "", "/" })
	public @NotNull Iterable<User> getUsers() {
		return userService.getAllUsers();
	}
}
