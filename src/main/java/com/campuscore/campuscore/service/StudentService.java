package com.campuscore.campuscore.service;

import com.campuscore.campuscore.dto.StudentResponseDTO;
import com.campuscore.campuscore.model.Student;
import com.campuscore.campuscore.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    private StudentResponseDTO convertToDTO(Student student) {
        StudentResponseDTO dto = new StudentResponseDTO();
        dto.setName(student.getName());
        dto.setEmail(student.getEmail());
        dto.setBranch(student.getBranch());
        dto.setCurrentYear(student.getCurrentYear());
        dto.setEnrollmentNo(student.getEnrollmentNo());
        return dto;
    }
    public List<StudentResponseDTO> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentResponseDTO> dtos = new ArrayList<>();
        for(Student s : students) {
            dtos.add(convertToDTO(s));
        }
        return dtos;
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
    public Student updateStudent(Long id, Student updatedStudent) {
        Student existing = studentRepository.findById(id).orElse(null);
        if(existing != null) {
            updatedStudent.setId(id);
            return studentRepository.save(updatedStudent);
        }
        return null;
    }
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}