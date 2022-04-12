package com.revature.p1.dao;

import java.util.ArrayList;

import com.revature.p1.app.Employee;

public interface ErsDaoInt {
	
	ArrayList<Employee>getAllEmployee();
	
	Employee postEmployee(Employee e1);
	
	Employee updateEmployee(String name, String reason, String status, Employee e1);
	
	Employee updateRequest(Employee e1);
}
