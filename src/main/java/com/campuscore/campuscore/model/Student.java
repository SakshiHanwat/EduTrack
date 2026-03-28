package com.campuscore.campuscore.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String fatherName;
    private String motherName;
    private String email;
    private String mobile;
    private String dob;
    private String category;
    private String branch;
    private int currentYear;
    private String enrollmentNo;
}
