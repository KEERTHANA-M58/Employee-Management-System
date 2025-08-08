package com.emp.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.Employee.dao.Employeedao;
import com.emp.Employee.pojo.Employee;

@RequestMapping("/api/v1")
@RestController
public class EmployeeController {
	@Autowired
	Employeedao dao;
	@GetMapping("/emplist")
	public List<Employee> getEmployeedata(){
		return dao.getallEmployee();	
	}
	@PostMapping("/saveemp")
	public String saveEmployeedata(@RequestBody Employee emp) {
		dao.saveemployeedata(emp);
		return "Saved Successfully";
	}
	@GetMapping("/getEmp/{id}")
	public Employee getEmployeedataById(@PathVariable int id){
		return dao.getEmpById(id);	
	}
	@PostMapping("/update/{id}")
	public String updateEmployeedata(@RequestBody Employee emp,@PathVariable int id) {
		return dao.updateEmployee(emp, id);
		
	}

}
