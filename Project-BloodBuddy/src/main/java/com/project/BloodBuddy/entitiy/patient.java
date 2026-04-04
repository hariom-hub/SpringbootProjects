package com.project.BloodBuddy.entitiy;

import com.project.BloodBuddy.entitiy.type.BloodGroupType;
import com.project.BloodBuddy.entitiy.type.GenderType;
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
@Table
        (name = "patient",
        uniqueConstraints = {@UniqueConstraint(name = "unique_patient_email",columnNames = {"email"}),
                             @UniqueConstraint(name = "unique_patient_name_birthDate",columnNames = {"name","birthdate"})
        }


        )

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
    // private String gender;
    // changing the type of gender from string to enum to restrict user to select only the given genders (male, female or prefer not to say)

    @Enumerated(EnumType.STRING)
    private GenderType gender;

    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;
}

