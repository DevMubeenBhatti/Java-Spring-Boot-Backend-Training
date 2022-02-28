package com.training.demo.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.demo.demo.model.Students;

public interface StudentRepo extends JpaRepository<Students, Long>{

}
