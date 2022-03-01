package com.api.employee.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.employee.employee.model.EmpModel;
import com.api.employee.employee.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	public EmpService implementEmpService;
	
	@GetMapping("/employees")
	public List<EmpModel> Employees(){
		return implementEmpService.allEmployee();
	}
	@GetMapping("/employees/{id}")
	public EmpModel Employee(@PathVariable Long id ) {
		return  implementEmpService.employee(id);
	}
	@PostMapping("/employees")
	public void addEmp(@RequestBody EmpModel emp ) {
		implementEmpService.addEmp(emp);
	}
	@DeleteMapping("/employees/{id}")
	public void deleteEmp(@PathVariable Long id) {
		implementEmpService.deleteEmp(id);
	}
	@PutMapping("/employees/{id}")
	public void updateEmp(@PathVariable Long id, @RequestBody EmpModel emp) {
		implementEmpService.updateEmp(id, emp);
	}
	
}
