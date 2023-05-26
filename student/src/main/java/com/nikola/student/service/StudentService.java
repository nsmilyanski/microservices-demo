package com.nikola.student.service;

import com.nikola.student.model.Student;

import java.util.List;

public interface StudentService {
    public void saveStudent(Student student);
    public List<Student> findAll();

    List<Student> findAllStudentsByScool(Integer schoolId);
}
