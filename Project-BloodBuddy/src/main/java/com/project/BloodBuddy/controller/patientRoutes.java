package com.project.BloodBuddy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class patientRoutes {
    @GetMapping("/")
    public String GetDemo(){
        return "working correctly.";
    }
}
