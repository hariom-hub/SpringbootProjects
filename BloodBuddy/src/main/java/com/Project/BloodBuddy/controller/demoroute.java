package com.Project.BloodBuddy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class demoroute {
    @GetMapping("/demo")
    public static String Demo(){
        return "this is a demo route.";
    }
}
