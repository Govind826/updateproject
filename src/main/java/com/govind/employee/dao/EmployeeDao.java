package com.govind.employee.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.govind.employee.bean.Employee;



@Repository
public class EmployeeDao {
	
    public static List<Employee> employees 
	= new ArrayList<Employee>
           ( Arrays.asList( 
		         	new Employee(1, "Amitabh", 20), 
		         	new Employee(2, "Ayush", 30),
		        	new Employee(3, "Amitoh", 40),
		        	new Employee(4, "AKhil", 40),
		        	new Employee(5, "Amitnath", 40)) );

	
}
	