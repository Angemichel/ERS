package com.revature.p1.controller;

import java.util.ArrayList;

import com.revature.p1.app.Account;
import com.revature.p1.app.Employee;
import com.revature.p1.service.ErsService;
import com.revature.p1.service.ErsServiceInt;

import io.javalin.http.Handler;

public class ErsController {
	
	static ErsServiceInt service = new ErsService();
	
	public static Handler getAllEmployee = ctx ->{
		ArrayList<Employee> eList = service.getAllEmployee();
		ctx.json(eList);
		
	};
	
	public static Handler postEmployee = ctx ->{
		Employee e1 = ctx.bodyAsClass(Employee.class);
		service.postEmployee(e1);
	};
	
	
	
	public static Handler updateRequest = ctx ->{
		Employee e1 = ctx.bodyAsClass(Employee.class);
		
		
		service.updateRequest(e1);
	};
	
	public static Handler getAccount = ctx ->{
		
		ArrayList<Account> aList = new ArrayList<Account>();
		
		Account a1 = ctx.bodyAsClass(Account.class);
		
		aList = service.getAccount(a1);
		
		ctx.json(aList);
		
		
	};
	
	

	public static Handler getEmployee = ctx ->{
		String name = ctx.pathParam("name");
		
		ArrayList<Employee> eList = new ArrayList<Employee>();
		eList = service.getEmployee(name);
		
		ctx.json(eList);
		
	};
	
	public static Handler getPending = ctx ->{
		ArrayList<Employee> eList = service.getPending();
		ctx.json(eList);
		
	};
	
}
