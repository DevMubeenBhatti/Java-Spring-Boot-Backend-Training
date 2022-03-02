package com.college.college.controller;

import com.college.college.model.Student;
import com.college.college.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@RestController
public class StudentController {
    @Autowired
    public StudentService stdService;

    @GetMapping("/student")
    public List<Student> ListStudent(){
        return stdService.STUDENT_LIST();
    }
//  Active student
    @GetMapping("/students")
    public Stream<Student> ListStudents(){
        return stdService.nStudent();
    }
//  Active Allstudent
    @GetMapping("/students/{id}")
    public Student ListStudents(@PathVariable  Long id){
        return stdService.activeStudent(id);
    }
    @GetMapping("/student/{id}")
    public Student STUDENT_GET(@PathVariable Long id){
        return stdService.STUDENT_GET(id);
    }
    @PostMapping("/student")
    public void STUDENT_ADD(@RequestBody Student std){
        stdService.STUDENT_ADD(std);
    }
    @DeleteMapping("/student/{id}")
    public void STUDENT_DEL(@PathVariable Long id ){
        stdService.STUDENT_DEL(id);
    }
    @PutMapping("/student/{id}")
    public void STUDENT_UPDATE(@PathVariable Long id, @RequestBody Student std){
        stdService.STUDENT_UPDATE(id, std);
    }
}
