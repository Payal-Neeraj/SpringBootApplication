package com.assesment.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.demo.dao.UserDao;
import com.assesment.demo.entity.User;


@Service		//it provides business functionality
public class UserImpl implements UserService {
	@Autowired				//inject the UserDao object implicitly
	private UserDao userDao;
	
	List<User> list;		//list is used to store the user data
	
	//call jpa repository method to get all the users data from database
	  @Override 
	  public List<User> getUsers() {	  
		  return userDao.findAll(); 			//findAll() is a predefined method of to get all the data of user
	  }
	 

	//call jpa repository method to save the user info to database
	@Override
	public User addUser(User user) {
		userDao.save(user);						//save() is predefined method to post the user data into database
		return user;
	}
	

}
