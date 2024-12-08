package com.asifraza.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {

		// create an instance of Spring Boot ApplicationContext
		ApplicationContext context = SpringApplication.run(FirstprojectApplication.class, args);
		
		// get an instance of Alien class from the ApplicationContext  in spring we dont need to create an object insted of we have to get it from bean 
		alien obj = context.getBean(alien.class);
		obj.setAge(442);
		System.out.println(obj.getAge());

		obj.show();
	}

}
