package com.Project.BloodBuddy;

import com.Project.BloodBuddy.entity.Patient;
import com.Project.BloodBuddy.repository.PatientRepository;
import com.Project.BloodBuddy.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
public class patienttests {

    @Autowired // this annotation is used in injecting beans of other classes into a single class, prevents us from writing new keyword every single time
    private PatientRepository patientRepository;
    @Autowired
    private  PatientService patientService;


    // tests are programatically written with return type as null
    @Test
    public void TestPatientRepo(){
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);
    }

    @Test
    public void TestTransactionMethods(Long id){
        System.out.println(patientService.getPatientById(1L));
    }


}
