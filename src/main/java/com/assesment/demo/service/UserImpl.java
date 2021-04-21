package com.assesment.demo.service;

import java.util.ArrayList;
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
//		list=new ArrayList<>();
//		list.add(new User("Payal",19, "nssharma@gmail.com"));
//		list.add(new User("Keshav",24,"keshav@gmail.com"));
	}

	
	  @Override 
	  public List<User> getUsers() {
	  
	  return userDao.findAll(); 
	  }
	 

	
	@Override
	public User addUser(User user) {
//		list.add(course);
		userDao.save(user);
		return user;
	}
	

}
