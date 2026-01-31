package com.Project.BloodBuddy.service;

import com.Project.BloodBuddy.entity.Patient;
import com.Project.BloodBuddy.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    @Autowired
    private final PatientRepository patientRepository;

    @Transactional
    public Patient getPatientById(Long id) {
        Patient p1 = patientRepository.findById(id).orElseThrow();
        Patient p2 = patientRepository.findById(id).orElseThrow();
        System.out.println(p1 == p2);
        return p1;
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
