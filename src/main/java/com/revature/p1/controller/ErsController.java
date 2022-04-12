package com.revature.p1.controller;

import java.util.ArrayList;

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
	
	public static Handler updateEmployee = ctx ->{
		Employee e1 = ctx.bodyAsClass(Employee.class);
		String name = ctx.pathParam("name");
		String reason = ctx.pathParam("reason");
		String status = ctx.pathParam("status");
		
		service.updateEmployee(name, reason, status, e1);
	};
	
	public static Handler updateRequest = ctx ->{
		Employee e1 = ctx.bodyAsClass(Employee.class);
		
		
		service.updateRequest(e1);
	};

}
