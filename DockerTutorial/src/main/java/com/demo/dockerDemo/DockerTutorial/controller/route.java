package com.demo.dockerDemo.DockerTutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class route {

    @GetMapping("/hello")
    public String Hello(){
        return "Hii! There.";
    }
}
