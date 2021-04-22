package com.assesment.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication		//this annotation is often placed often on your main class
public class TestApplication {

	
	public static void main(String[] args) {
		
		//SpringApplication is used to launch a spring application using java main method
		SpringApplication.run(TestApplication.class, args); 	
		
	}

}
