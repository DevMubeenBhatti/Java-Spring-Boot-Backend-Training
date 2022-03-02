package com.college.college.service;

import com.college.college.model.Student;

import java.util.List;
import java.util.stream.Stream;

public interface StudentService {
    public void STUDENT_ADD(Student std);
    public List<Student> STUDENT_LIST();
    public Stream<Student> nStudent();
    public Student activeStudent(Long id);
    public Student STUDENT_GET(Long id);
    public void STUDENT_DEL(Long id);
    public void STUDENT_UPDATE(Long id, Student std);
}
