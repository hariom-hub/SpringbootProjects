package com.project.BloodBuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BloodBuddyApplication {

	public static void server(){
		System.out.println("Server is running on port : "+5050);
	}
	public static void main(String[] args) {
		SpringApplication.run(BloodBuddyApplication.class, args);
		server();

	}

}
