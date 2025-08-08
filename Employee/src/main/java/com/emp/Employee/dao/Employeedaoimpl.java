package com.emp.Employee.dao;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.Employee.pojo.Employee;
import com.emp.Employee.repo.EmployeeRepo;
@Service
public class Employeedaoimpl implements Employeedao{

	@Autowired
	EmployeeRepo repo;
	@Override
	public List<Employee> getallEmployee() {
		return repo.findAll();
	}
	@Override
	public void saveemployeedata(Employee emp) {
		repo.save(emp);
		
	}
	@Override
	public Employee getEmpById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	@Override
	public String updateEmployee(Employee e, int id) {
		Employee emp =getEmpById(id);
		if(Objects.nonNull(emp)) {
			emp.setEmpid(e.getEmpid());
			emp.setEmpname(e.getEmpname());
			emp.setDept(e.getDept());
			emp.setAddress(e.getAddress());
			saveemployeedata(emp);
			return "Updated Successfully";
		}else {
			return "Employee data for id"+id+"not exist";
		}
		
	}

}
