package com.assesment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.assesment.demo.entity.User;
import com.assesment.demo.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("api")
public class UserController {

	@Autowired
	private UserService userService;
	RestTemplate restTemplate;
	
	@GetMapping("/home")
	public String home(){
		return "Your data is succesfully saved on your database";
		
	}
	
	//get the user
	@GetMapping("/users")
	public List<User> getUsers(){
		return this.userService.getUsers();
		
	}
	
	//post the user
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
}
