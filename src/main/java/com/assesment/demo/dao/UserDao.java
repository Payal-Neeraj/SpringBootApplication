package com.assesment.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assesment.demo.entity.User;


public interface UserDao extends JpaRepository<User, Long> {

}
