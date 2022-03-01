package com.api.employee.employee.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.employee.employee.model.EmpModel;
import com.api.employee.employee.repo.EmpRepo;
import com.api.employee.employee.service.EmpService;

@Service
public class EmpServiceImplementation implements EmpService{
	
	@Autowired
	public EmpRepo empRepo;
	
	@Override
	public List<EmpModel> allEmployee() {
		List<EmpModel> list = empRepo.findAll();
		return list;
	}

	@Override
	public EmpModel employee(Long id) {
		Optional<EmpModel> employee =empRepo.findById(id);
//		if(employee.isPresent())
//			return employee.get();
//		return null;
		return employee.get();
	}
	
	@Override
	public void addEmp(EmpModel emp) {
		empRepo.save(emp);
	}
	@Override 
	public void deleteEmp(Long id) {
		empRepo.deleteById(id);
	}
	@Override 
	public void updateEmp(Long id, EmpModel emp) {
		Optional<EmpModel> updateEmp = empRepo.findById(id);
		if(updateEmp.isPresent()) {
			EmpModel e = updateEmp.get();
			e.setName(emp.getName());
			e.setTitle(emp.getTitle());
			empRepo.save(e);
		}
	}
}
