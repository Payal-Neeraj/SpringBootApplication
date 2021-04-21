package com.assesment.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.demo.dao.UserDao;
import com.assesment.demo.entity.User;


@Service
public class UserImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	List<User> list;
	public UserImpl() {
	}

	//call jpa repository method to get all the users data from database
	  @Override 
	  public List<User> getUsers() {	  
		  return userDao.findAll(); 
	  }
	 

	//call jpa repository method to save the user info to database
	@Override
	public User addUser(User user) {
		userDao.save(user);
		return user;
	}
	

}
