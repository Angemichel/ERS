package com.revature.p1.app;

import com.revature.p1.controller.ErsController;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class App {
	public static void main(String[] args) {
		
	
		Javalin app = Javalin.create(ctx -> {ctx.enableCorsForAllOrigins();ctx.addStaticFiles("web",Location.CLASSPATH);}).start();
		
		app.get("/em", ErsController.getAllEmployee);
		
		app.post("/employees", ErsController.postEmployee);
		
		
		
		app.put("/employees/status", ErsController.updateRequest);
		
		//app.get("/code", ErsController.getAccount);
		
		
		
		app.get("/emp/{name}", ErsController.getEmployee);
		
		app.get("/pending", ErsController.getPending);
		
	}

}
