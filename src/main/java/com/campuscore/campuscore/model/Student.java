package com.campuscore.campuscore.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
@Table(name = "students")
public class Student extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fatherName;
    private String motherName;
    private String dob;
    private String category;

    @Min(value = 1, message = "Year must be between 1 and 4")
    @Max(value = 4, message = "Year must be between 1 and 4")
    private int currentYear;

    @NotBlank(message = "Enrollment number is required")
    private String enrollmentNo;

    @NotBlank(message = "Branch is required")
    private String branch;
}
