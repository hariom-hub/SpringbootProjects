package com.project.BloodBuddy.service;

import com.project.BloodBuddy.entitiy.patient;
import com.project.BloodBuddy.entitiy.type.BloodGroupType;
import com.project.BloodBuddy.entitiy.type.GenderType;
import com.project.BloodBuddy.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Transactional
    public patient getPatientById(Long id){

        // All the data will get into persistent Context until this method is called totally is everything happens successfully
        // then data will be saved into db otherwise even a single error will commit a rollback in transaction (db)
        patient p1 = patientRepository.findById(id).orElseThrow();
//        patient p2 = patientRepository.findById(id).orElseThrow();
//        p1.setName("BilloJi");
//        System.out.println(p1);
        return p1;
    }

   public List<patient>GetAllpatients(){
        return patientRepository.findAll();
   }

   public List<patient>GetPatientByBloodGrop(@Param("bloodGroup") BloodGroupType bloodGroup){

        List<patient> PatientList = patientRepository.findByBloodGroup(bloodGroup);
        return PatientList;
   }

   public List<patient>GetPatientByGender(@Param("gender")GenderType gender){

        List<patient>patientsList = patientRepository.findByGender(gender);
        return patientsList;
   }

}
