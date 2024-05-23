package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootBasicAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appcontext =SpringApplication.run(SpringBootBasicAnnotationApplication.class, args);
		
		Employee emp = appcontext.getBean(Employee.class);
		System.out.println(emp);
	}

}
