package com.project.BloodBuddy.repository;

import com.project.BloodBuddy.entitiy.patient;
import com.project.BloodBuddy.entitiy.type.BloodGroupType;
import com.project.BloodBuddy.entitiy.type.GenderType;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository

public interface PatientRepository extends JpaRepository<patient,Long> {

    // jpql
    @Query("SELECT p FROM patient p where p.bloodGroup = ?1")
    List<patient>findByBloodGroup(@Param("bloodGroup") BloodGroupType bloodGroup);

    // use gender as method parameter
    @Query("select g from patient g where g.gender = :gender")
    List<patient>findByGender(@Param("gender")GenderType gender);

    @Query("select p from patient p where p.birthdate > :birthdate")
    List<patient>GetPatientGreaterByBirthDate(@Param("birthdate") LocalDate birthdate);

    @Query(value = "select * from patient",nativeQuery = true)
//    List<patient>Allpatients();
    // helps in writing optimized query to fetch data on the basis of limit provided
    Page<patient> AllPatients(Pageable page);

    @Transactional
    @Modifying
    @Query("UPDATE patient p set p.name = :name where p.id = :id")
    int UpdateNameById(@Param("name") String name, @Param("id") Long id);




}
