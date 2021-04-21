package com.assesment.demo.service;



import java.util.List;

import com.assesment.demo.entity.User;


public interface UserService {
	public List<User> getUsers();
	public User addUser(User user);

}
