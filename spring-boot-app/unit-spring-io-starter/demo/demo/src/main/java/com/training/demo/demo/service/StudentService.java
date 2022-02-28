package com.training.demo.demo.service;

import java.util.List;
import java.util.Optional;
import com.training.demo.demo.model.Students;

public interface StudentService {
	public List<Students> allStudent();
	public Students singleStudent(Long id);
}
