package com.assesment.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assesment.demo.entity.User;

//dao interface that extends the functionality of jpa repository class
public interface UserDao extends JpaRepository<User, Long> {

}
