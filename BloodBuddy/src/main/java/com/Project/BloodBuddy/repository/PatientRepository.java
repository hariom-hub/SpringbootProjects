package com.Project.BloodBuddy.repository;

import com.Project.BloodBuddy.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
