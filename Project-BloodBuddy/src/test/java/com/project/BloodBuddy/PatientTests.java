package com.project.BloodBuddy;
import java.util.*;
import com.project.BloodBuddy.entitiy.patient;
import com.project.BloodBuddy.repository.PatientRepository;
import com.project.BloodBuddy.service.PatientService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PatientService patientService;
    @Test
    public void patientTests(){
        List<patient>patientList = patientRepository.findAll();
        System.out.println(patientList);
    }

    @Test
    @Transactional
    // All of this data will go into persistent Context

    public void TestTransactionalMethod(){

        patient patient = patientService.getPatientById(1L);

    }
}
