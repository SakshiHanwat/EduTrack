package com.campuscore.campuscore.service;

import com.campuscore.campuscore.model.Teacher;
import com.campuscore.campuscore.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    public Teacher updateTeacher(Long id, Teacher updatedTeacher) {
        Teacher existing = teacherRepository.findById(id).orElse(null);
        if(existing != null) {
            updatedTeacher.setTeacherId(id);
            return teacherRepository.save(updatedTeacher);
        }
        return null;
    }

    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}