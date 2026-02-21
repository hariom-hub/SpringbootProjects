package com.project.BloodBuddy.entitiy;

import com.project.BloodBuddy.entitiy.type.BloodGroupType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
//@Table
//        (name = "patient",
//        uniqueConstraints = {@UniqueConstraint(name = "unique_patient_email",columnNames = {"email"}),}
//
//        )

public class patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Email
    @Column (unique = true)
    private String Email;
    @Column(nullable = false)
    private String name;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate birthdate;
    private int age;
    private String gender;
    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;
}

