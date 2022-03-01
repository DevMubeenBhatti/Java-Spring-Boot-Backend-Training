package com.api.employee.employee.service;

import java.util.List;

import com.api.employee.employee.model.EmpModel;

public interface EmpService {
	public List<EmpModel> allEmployee();
	public EmpModel employee(Long id);
	public void addEmp(EmpModel emp);
	public void deleteEmp(Long id);
	public void updateEmp(Long id, EmpModel emp);
}
