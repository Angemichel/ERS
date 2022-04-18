package com.revature.p1.dao;

import java.util.ArrayList;

import com.revature.p1.app.Account;
import com.revature.p1.app.Employee;

public interface ErsDaoInt {
	
	ArrayList<Employee>getAllEmployee();
	
	Employee postEmployee(Employee e1);
	
	
	
	Employee updateRequest(Employee e1);
	
	ArrayList<Account>getAccount(Account a1);
	
	
	
	ArrayList<Employee>getEmployee(String name);
	
	ArrayList<Employee>getPending();
	
	
}
