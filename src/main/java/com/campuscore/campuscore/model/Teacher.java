package com.campuscore.campuscore.model;

import com.campuscore.campuscore.enums.Designation;
import jakarta.validation.constraints.*;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "teachers")
public class Teacher extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;

    private String joiningDate;
    private String subjectSpecialization;
    private Designation designation;

    @NotBlank(message = "Employee ID is required")
    private String employeeId;

    @NotBlank(message = "Department is required")
    private String department;

    @NotBlank(message = "Qualification is required")
    private String qualification;

    @Min(value = 0, message = "Experience cannot be negative")
    private int experienceYears;

    @Min(value = 0, message = "Salary cannot be negative")
    private double salary;
}