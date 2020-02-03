package com.govind.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.govind.employee.bean.Employee;
import com.govind.employee.controller.EmployeeController;
import com.govind.employee.service.EmployeeService;

@SpringBootTest
class EmployeeServiceTests {
	
	@Autowired
	EmployeeService employeeService ;
	
	@Autowired
	EmployeeController employeecontroller ;
 
	

	
	@Test 
	public void getEmployees()
	{
		Employee employee = employeeService.getEmployee(1);
		assertEquals("Amitabh" , employee.getName());
     }
	@Test
	public void getEmployee() {
		Employee employee = new Employee();
		employee.setName("Amitabh");
		assertEquals("Amitabh", employee.getName());
	}
	
	
	
  
}
	
 
