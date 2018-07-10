package com.springboot.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationSpringBoot {
	
	public static void main(String args[]) {
		ApplicationContext ctx = SpringApplication.run(ApplicationSpringBoot.class, args);
	}

}
