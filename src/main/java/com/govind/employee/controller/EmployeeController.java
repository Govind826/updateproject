package com.govind.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.govind.employee.bean.Employee;
import com.govind.employee.service.EmployeeService;



@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		
		return employeeService.getEmployees();   }

	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		
		return employeeService.getEmployee(id); }
	

	@GetMapping("/employees/name")
	public List<Employee> getEmployee(){
		return employeeService.getEmployee1(); 
		}

	
}

