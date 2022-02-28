package com.training.demo.demo.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.demo.model.Students;
import com.training.demo.demo.repo.StudentRepo;
import com.training.demo.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo repoStudents;

	@Override
	public List<Students> allStudent() {
		List<Students> list = repoStudents.findAll();
		return list;
	}

	@Override
	public Students singleStudent(Long id) {
		Optional<Students> std = repoStudents.findById(id);
		if (std.isPresent())
			return std.get();
		return null;
	}
}
