package com.project.BloodBuddy.controller;

import java.util.*;
import com.project.BloodBuddy.entitiy.patient;
import com.project.BloodBuddy.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class patientRoutes {

    private PatientService patientService;
    @GetMapping("/")
    public String GetDemo(){
        return "working correctly.";
    }

    @GetMapping ("/patients")
    public List<patient>Patients(){
        return patientService.GetAllpatients();
    }

}
