package com.Project.BloodBuddy.controller;
import com.Project.BloodBuddy.entity.Patient;
import com.Project.BloodBuddy.repository.PatientRepository;
import com.Project.BloodBuddy.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@Controller
@AllArgsConstructor
public class demoController {
    private final PatientService patientService;
    @Autowired
    private final PatientRepository patientRepository;
    @GetMapping("/demo")
    public static String Demo(){
        return "this is a demo route.";
    }
    @GetMapping("/Patients")
    public List<Patient> Patients(){
        return patientService.getAllPatients();
    }
}
