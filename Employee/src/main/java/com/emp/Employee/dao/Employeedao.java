package com.emp.Employee.dao;

import java.util.List;

import com.emp.Employee.pojo.Employee;

public interface Employeedao {
	List<Employee> getallEmployee();
	void saveemployeedata(Employee emp);
	Employee getEmpById(int id);
	String updateEmployee(Employee emp,int id);
}
