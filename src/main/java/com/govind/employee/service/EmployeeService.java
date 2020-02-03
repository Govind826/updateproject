package com.govind.employee.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.govind.employee.bean.Employee;
import com.govind.employee.dao.EmployeeDao;


@Service
public class EmployeeService {
	
    
	public List<Employee> getEmployees(){
		
		return EmployeeDao.employees;
	    }
	
	public Employee getEmployee(int id) {
		
		return EmployeeDao.employees.stream().filter(t -> t.getId() == id).findFirst().get();  
		}

	public List<Employee> getEmployee1(){
		
		List<Employee> FilteredList = EmployeeDao.employees.stream().filter(e->e.getName().contains("Amit")).collect(Collectors.toList());
		
		return FilteredList ; 
		}
	
}
