package com.campuscore.campuscore.model;

import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.*;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class Person {

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Mobile is required")
    @Size(min = 10, max = 10, message = "Mobile must be 10 digits")
    private String mobile;

    private String gender;
}