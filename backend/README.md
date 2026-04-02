# EduTrack 🎓

> A comprehensive College Management System — built with Java Spring Boot, MySQL, and React.js (Next.js)

![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.13-brightgreen?style=flat-square&logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=flat-square&logo=mysql)
![Maven](https://img.shields.io/badge/Maven-3.9-red?style=flat-square&logo=apachemaven)
![Status](https://img.shields.io/badge/Status-In%20Progress-yellow?style=flat-square)

---

## Overview

EduTrack is a full-stack College Management System designed to streamline academic operations — from student enrollment and attendance tracking to placement records and exam notifications.

Built with a clean layered architecture following industry best practices:
- **REST API** backend with Spring Boot
- **Persistent storage** with MySQL and Spring Data JPA
- **DTO pattern** for secure and clean API responses
- **Global exception handling** and input validation
- **Next.js** frontend (in progress)

---

## Features

- ✅ Student Management — Add, view, update, and delete student records
- ✅ Teacher Management — Manage faculty information and assignments
- ✅ Input Validation — Prevents invalid data from entering the system
- ✅ DTO Pattern — Sensitive fields hidden from API responses
- ✅ Global Exception Handling — Clean, readable error messages
- ✅ Enum Support — Controlled values for Designation
- ✅ Inheritance — Shared Person model for Student and Teacher
- 🔄 Course & Attendance Module — Coming soon
- 🔄 Exam Notifications — Coming soon
- 🔄 Placement Records — Coming soon
- 🔄 Role-Based Access — Admin, Teacher, Student — Coming soon
- 🔄 JWT Authentication — Coming soon

---

## Tech Stack

| Layer | Technology |
|-------|-----------|
| Backend | Java 17, Spring Boot 3.5.13 |
| Database | MySQL 8.0, Spring Data JPA, Hibernate |
| Validation | Spring Boot Starter Validation |
| Boilerplate Reduction | Lombok |
| Frontend | Next.js, Axios (coming soon) |
| Security | Spring Security, JWT (coming soon) |
| Build Tool | Maven |
| Testing | Postman |

---

## Project Architecture

```
src/
└── main/
    └── java/
        └── com.campuscore.campuscore/
            ├── controller/
            │   ├── StudentController.java
            │   └── TeacherController.java
            ├── service/
            │   ├── StudentService.java
            │   └── TeacherService.java
            ├── repository/
            │   ├── StudentRepository.java
            │   └── TeacherRepository.java
            ├── model/
            │   ├── Person.java          ← Abstract base class
            │   ├── Student.java         ← Extends Person
            │   └── Teacher.java         ← Extends Person
            ├── dto/
            │   └── StudentResponseDTO.java
            ├── exception/
            │   └── GlobalExceptionHandler.java
            └── enums/
                └── Designation.java
```

---

## API Endpoints

### Student APIs

| Method | Endpoint | Description | Auth Required |
|--------|---------|-------------|---------------|
| GET | `/api/students` | Get all students (DTO) | Admin |
| GET | `/api/students/{id}` | Get student by ID | Admin |
| POST | `/api/students` | Add new student | Admin |
| PUT | `/api/students/{id}` | Update student | Admin |
| DELETE | `/api/students/{id}` | Delete student | Admin |

### Teacher APIs

| Method | Endpoint | Description | Auth Required |
|--------|---------|-------------|---------------|
| GET | `/api/teachers` | Get all teachers | Admin |
| GET | `/api/teachers/{id}` | Get teacher by ID | Admin |
| POST | `/api/teachers` | Add new teacher | Admin |
| PUT | `/api/teachers/{id}` | Update teacher | Admin |
| DELETE | `/api/teachers/{id}` | Delete teacher | Admin |

---

## Getting Started

### Prerequisites

- Java 17+
- MySQL 8.0+
- Maven 3.9+

### Installation

1. Clone the repository
```bash
git clone https://github.com/SakshiHanwat/EduTrack.git
cd EduTrack
```

2. Create MySQL database
```sql
CREATE DATABASE campuscore;
```

3. Configure `src/main/resources/application.properties`
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/campuscore
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

4. Run the application
```bash
mvn spring-boot:run
```

5. API is available at `http://localhost:8080`

---

## Testing the API

Use **Postman** to test the endpoints.

**Add a Student (POST /api/students):**
```json
{
    "name": "Sakshi Hanwat",
    "fatherName": "Yash Hanwat",
    "motherName": "Meena Hanwat",
    "email": "sakshi@gmail.com",
    "mobile": "9876543210",
    "gender": "Female",
    "dob": "2003-05-15",
    "category": "General",
    "branch": "CSE",
    "currentYear": 2,
    "enrollmentNo": "0901CS221234"
}
```

**Add a Teacher (POST /api/teachers):**
```json
{
    "name": "Dr. Sharma",
    "email": "sharma@college.com",
    "mobile": "9876543210",
    "gender": "Male",
    "employeeId": "EMP2024001",
    "joiningDate": "2020-06-15",
    "department": "CSE",
    "subjectSpecialization": "Data Structures",
    "qualification": "PhD",
    "experienceYears": 8,
    "designation": "PROFESSOR",
    "salary": 85000.00
}
```

**Validation Error Response:**
```json
{
    "name": "Name is required",
    "email": "Invalid email format",
    "mobile": "Mobile must be 10 digits"
}
```

---

## Design Decisions

**Why DTO Pattern?**
Direct entity exposure risks leaking sensitive data (salary, mobile). DTOs return only what the client needs.

**Why @MappedSuperclass for Person?**
Student and Teacher share common fields (name, email, mobile, gender). Inheritance eliminates duplication — Single Responsibility Principle.

**Why Enum for Designation?**
Prevents inconsistent data entry — only predefined values like `PROFESSOR`, `HOD` are accepted.

**Why GlobalExceptionHandler?**
Centralized error handling — no try-catch in every controller. Clean, consistent error responses across the entire API.

---

## Roadmap

- [x] Student CRUD REST API
- [x] Teacher CRUD REST API
- [x] MySQL Integration with JPA & Hibernate
- [x] Input Validation with meaningful error messages
- [x] DTO Pattern for secure API responses
- [x] Global Exception Handling
- [x] Enum support for controlled values
- [x] Inheritance — Person abstract base class
- [ ] Course & Attendance Module
- [ ] Next.js Frontend Dashboard
- [ ] JWT Authentication & Role-Based Access Control
- [ ] Deployment on Cloud (Railway/Render + Vercel)

---

## Author

**Sakshi Hanwat**
- GitHub: [@SakshiHanwat](https://github.com/SakshiHanwat)

---

*EduTrack — Simplifying college management, one feature at a time.* 🚀