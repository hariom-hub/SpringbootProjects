package com.demo.dockerDemo.DockerTutorial;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DockerTutorialApplication {




	public static void main(String[] args) {
		SpringApplication.run(DockerTutorialApplication.class, args);

	}


}
