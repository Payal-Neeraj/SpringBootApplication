package com.assesment.demo.service;



import java.util.List;

import com.assesment.demo.entity.User;

//UserService interface that provides services to RESTful controller
public interface UserService {
	
	//UserService abstract methods
	public List<User> getUsers();
	public User addUser(User user);

}
