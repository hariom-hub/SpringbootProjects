package com.project.BloodBuddy;
import java.time.LocalDate;
import java.util.*;
import com.project.BloodBuddy.entitiy.patient;
import com.project.BloodBuddy.entitiy.type.BloodGroupType;
import com.project.BloodBuddy.entitiy.type.GenderType;
import com.project.BloodBuddy.repository.PatientRepository;
import com.project.BloodBuddy.service.PatientService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PatientService patientService;


    // All of this data will go into persistent Context

//    @Test
////    @Transactional
//    public void testTransactionalMethod(){
//
////        patient patient = patientService.getPatientById(1L);
//        List<patient>patients = patientRepository.findByBloodGroup(BloodGroupType.AB_POSITIVE);
//        for(patient p : patients){
//            System.out.println(p);
//        }
//
//    }

    @Transactional
   @Test
    public void BloodGroupTest(){
        List<patient>patientlist = patientRepository.findByBloodGroup(BloodGroupType.AB_POSITIVE);
        for(patient p : patientlist) System.out.println(p);
    }

    @Test
    public void GetByGender(){
        List<patient>patientlist = patientRepository.findByGender(GenderType.Female);
        for(patient p : patientlist){
            System.out.println(p);
        }
    }

    @Test
    public void GetPatientByBirthDate(){
        List<patient>patientList = patientRepository.GetPatientGreaterByBirthDate(LocalDate.of(2004,12,06));
    }

    @Test
    public void GetAllPatients(){

        Page<patient>patientlist = patientRepository.AllPatients(PageRequest.of(0,2));
        for(patient p : patientlist){
            System.out.println(p);
        }
    }


}
