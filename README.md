# EduTrack 🎓

> A comprehensive College Management System — built with Java Spring Boot, MySQL, and React.js

![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.13-brightgreen?style=flat-square&logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=flat-square&logo=mysql)
![Status](https://img.shields.io/badge/Status-In%20Progress-yellow?style=flat-square)

---

## Overview

EduTrack is a full-stack College Management System designed to streamline academic operations — from student enrollment and attendance tracking to placement records and exam notifications.

Built with a layered architecture following industry best practices — REST API backend with Spring Boot, persistent storage with MySQL, and a React.js frontend (in progress).

---

## Features

- Student Management — Add, view, update, and delete student records
- Teacher Management — Manage faculty information and assignments
- Course & Branch Management — Track departments and academic programs
- Attendance Tracking — Monitor student attendance per subject
- Exam Notifications — Notify students about upcoming exams and schedules
- Placement Records — Track company visits and placement statistics
- Scholarship Updates — Manage and display scholarship information
- Role-Based Access — Admin, Teacher, and Student roles (coming soon)

---

## Tech Stack

| Layer | Technology |
|-------|-----------|
| Backend | Java 17, Spring Boot 3.5.13 |
| Database | MySQL 8.0, Spring Data JPA, Hibernate |
| Frontend | React.js, Axios (coming soon) |
| Security | Spring Security, JWT (coming soon) |
| Build Tool | Maven |
| Testing | Postman |

---

## Project Structure

```
src/
└── main/
    └── java/
        └── com.campuscore.campuscore/
            ├── controller/     ← REST API endpoints
            ├── service/        ← Business logic
            ├── repository/     ← Database operations
            ├── model/          ← JPA entities
            ├── dto/            ← Data Transfer Objects
            ├── exception/      ← Custom exceptions
            └── enums/          ← Enums (Role, Category, etc.)
```

---

## API Endpoints

### Student APIs

| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/api/students` | Get all students |
| GET | `/api/students/{id}` | Get student by ID |
| POST | `/api/students` | Add new student |
| PUT | `/api/students/{id}` | Update student |
| DELETE | `/api/students/{id}` | Delete student |

---

## Getting Started

### Prerequisites

- Java 17+
- MySQL 8.0+
- Maven

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

3. Configure `application.properties`
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

**Add a Student (POST):**
```json
{
    "name": "Sakshi Hanwat",
    "fatherName": "Yash Hanwat",
    "motherName": "Meena Hanwat",
    "email": "sakshi@gmail.com",
    "mobile": "9876543210",
    "dob": "2003-05-15",
    "category": "General",
    "branch": "CSE",
    "currentYear": 2,
    "enrollmentNo": "0901CS221234"
}
```

---

## Roadmap

- [x] Student CRUD REST API
- [x] MySQL Integration with JPA
- [ ] Teacher Management API
- [ ] Course & Attendance Module
- [ ] Exception Handling & Validation
- [ ] React.js Frontend Dashboard
- [ ] JWT Authentication & Role-Based Access
- [ ] Deployment on Cloud

---

## Author

**Sakshi Hanwat**
- GitHub: [@SakshiHanwat](https://github.com/SakshiHanwat)

---

*EduTrack — Simplifying college management, one feature at a time.* 🚀