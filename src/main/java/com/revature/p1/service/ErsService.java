package com.revature.p1.service;

import java.util.ArrayList;

import com.revature.p1.app.Account;
import com.revature.p1.app.Employee;
import com.revature.p1.dao.ErsDAO;
import com.revature.p1.dao.ErsDaoInt;

public class ErsService implements ErsServiceInt{
	
	ErsDaoInt dao = new ErsDAO();
	@Override
	public ArrayList<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}
	@Override
	public Employee postEmployee(Employee e1) {
		// TODO Auto-generated method stub
		return dao.postEmployee(e1);
	}
	
	@Override
	public Employee updateRequest(Employee e1) {
		// TODO Auto-generated method stub
		return dao.updateRequest(e1);
	}
	@Override
	public ArrayList<Account> getAccount(Account a1) {
		// TODO Auto-generated method stub
		return dao.getAccount(a1);
	}
	
	@Override
	public ArrayList<Employee> getEmployee(String name) {
		// TODO Auto-generated method stub
		return dao.getEmployee(name);
	}
	@Override
	public ArrayList<Employee> getPending() {
		// TODO Auto-generated method stub
		return dao.getPending();
	}

}
