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

}
