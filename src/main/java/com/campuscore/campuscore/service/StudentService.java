package com.campuscore.campuscore.service;

import com.campuscore.campuscore.model.Student;
import com.campuscore.campuscore.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
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