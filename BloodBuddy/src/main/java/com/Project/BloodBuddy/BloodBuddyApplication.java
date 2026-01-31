package com.Project.BloodBuddy;

import org.apache.catalina.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BloodBuddyApplication {
    public static void ServerInfo(){

        try{
            System.out.println("Server is running on port : "+7075);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

	public static void main(String[] args) {
		SpringApplication.run(BloodBuddyApplication.class, args);
        ServerInfo();
	}

}
