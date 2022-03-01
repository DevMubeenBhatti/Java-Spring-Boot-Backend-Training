package com.api.employee.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.api.employee.employee.model.EmpModel;

//public interface EmpRepo extends CrudRepository<EmpModel, Long>{
//}
public interface EmpRepo extends JpaRepository<EmpModel, Long>{
}
