package com.project.BloodBuddy.controller;

import java.util.*;
import com.project.BloodBuddy.entitiy.patient;
import com.project.BloodBuddy.entitiy.type.BloodGroupType;
import com.project.BloodBuddy.entitiy.type.GenderType;
import com.project.BloodBuddy.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor  // inject dependency constructor
public class patientRoutes {

    private final PatientService patientService;
    @GetMapping("/")
    public String GetDemo(){
        return "working correctly.";
    }

    @GetMapping ("/patients")
    public List<patient>Patients(){
        return patientService.GetAllpatients();
    }

    @GetMapping ("/patients/{bloodGroup}")
    public List<patient>GetPatientByBloodGroup(@PathVariable BloodGroupType bloodGroup){

        return patientService.GetPatientByBloodGrop(bloodGroup);
    }

    @GetMapping("/patients/gender/{gender}")
    public List<patient>GetPatientByGender(@PathVariable GenderType gender){
        return patientService.GetPatientByGender(gender);
    }
}
