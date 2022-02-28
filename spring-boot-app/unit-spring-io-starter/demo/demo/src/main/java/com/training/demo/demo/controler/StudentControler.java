package com.training.demo.demo.controler;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.training.demo.demo.model.Students;
import com.training.demo.demo.service.StudentService;

@RestController
public class StudentControler {
	@Autowired
	private StudentService impStudents;
	
	@GetMapping("/student")
	public List<Students> Students(){
		return impStudents.allStudent();
	}
	
	@GetMapping("/student{id}")
	public Students Student(@PathVariable Long id) {
		return impStudents.singleStudent(id);
	}
}
