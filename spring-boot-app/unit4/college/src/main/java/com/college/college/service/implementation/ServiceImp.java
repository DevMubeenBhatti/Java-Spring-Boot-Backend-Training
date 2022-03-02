package com.college.college.service.implementation;

import com.college.college.exception.studentNotFoundException;
import com.college.college.model.Student;
import com.college.college.repo.StudentRepo;
import com.college.college.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class ServiceImp implements StudentService {
    @Autowired
    public StudentRepo stdRepo;
    public void STUDENT_ADD(Student std){
        stdRepo.save(std);
    }
    public List<Student> STUDENT_LIST(){
        return stdRepo.findAll();
    }

    public Stream<Student> nStudent(){
        List<Student> stu = stdRepo.findAll();
        Stream<Student> std = stu.stream().filter(t -> t.isStatus() == true);
        return std;
    }
    public Student STUDENT_GET(Long id){
        Optional<Student> std = stdRepo.findById(id);
        return std.get();
    }
    public Student activeStudent(Long id){
        Optional<Student> std = stdRepo.getStudentActive(id);
        if (!std.isPresent()){
            throw new studentNotFoundException("already deleted not found");
        }
        return std.get();
    }
    public void STUDENT_DEL(Long id){
        Optional<Student> std= stdRepo.findById(id);
        if(!std.isPresent()){
            throw new studentNotFoundException ("student not found");
        }else {
            Student std1 = std.get();
            std1.setStatus(false);
            stdRepo.save(std1);
        }
    }
    public void STUDENT_UPDATE(Long id, Student std){
        Optional<Student> updStd= stdRepo.findById(id);
        if(updStd.isPresent()) {
            Student s = updStd.get();
            s.setFirstName(std.getFirstName());
            s.setLastName(std.getLastName());
            s.setRollNo(std.getRollNo());
            stdRepo.save(s);
        }
    }
}
