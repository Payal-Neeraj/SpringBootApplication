package com.assesment.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity			//this annotation is used to map the class to table in database(name of table will be same as class name in small letters)
public class User {
	
	@Id			//change the constraint of an atttribute to primary key
	@GeneratedValue(strategy=GenerationType.AUTO)			//set the value of an attribute to auto increment
	private long id;
	private String name;
	private int age;
	private String email;
	
	//default construtor of user class
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized construtor of user class
	public User(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	//getter-setter methods
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
