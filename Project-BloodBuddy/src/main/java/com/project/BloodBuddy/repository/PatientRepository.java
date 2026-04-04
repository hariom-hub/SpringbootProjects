package com.project.BloodBuddy.repository;

import com.project.BloodBuddy.entitiy.patient;
import com.project.BloodBuddy.entitiy.type.BloodGroupType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface PatientRepository extends JpaRepository<patient,Long> {

    // jpql
    @Query("SELECT p FROM patient p where p.bloodGroup = ?1")
    List<patient>findByBloodGroup(@Param("bloodGroup") BloodGroupType bloodGroup);
}
