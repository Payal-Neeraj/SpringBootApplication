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

@CrossOrigin    				//enabling cross origin requests for a RESTful Web Service
@RestController  				//simplify the creation of RESTful web service
@RequestMapping("api")			//it maps http requests to REST controller	
public class UserController {

	@Autowired								//inject the object dependency implicitly 
	private UserService userService; 		//creating object of user service class
	RestTemplate restTemplate;
	
	//call service method  to get the user data from database
	@GetMapping("/users") 					//for mapping http GET request
	public List<User> getUsers(){
		return this.userService.getUsers();
		
	}
	
	//call service class method to save the user data into database
	@PostMapping("/users")						//for mapping http POST request
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
}
