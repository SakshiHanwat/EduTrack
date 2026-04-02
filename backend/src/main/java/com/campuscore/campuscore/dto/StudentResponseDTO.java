package com.campuscore.campuscore.dto;

import lombok.Data;

@Data
public class StudentResponseDTO {
    private String name;
    private String email;
    private String branch;
    private int currentYear;
    private String enrollmentNo;
}