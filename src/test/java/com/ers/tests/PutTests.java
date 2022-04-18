package com.ers.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.revature.p1.app.Employee;
import com.revature.p1.dao.ErsDAO;

public class PutTests {
	ErsDAO ed = new ErsDAO();
	
	@Test
	public void RequestTest() {
		Employee e1 = new Employee ("Ange",0,"Health","Approved");
		Employee e2 = new Employee ("Ange",0,"Health","Denied");
		
		Employee e3 = ed.updateRequest(e1);
		
		//Assertions.assertEquals(e1.getStatus(),e3.getStatus());
		Assertions.assertEquals(e1.getStatus(),e3.getStatus());
	}
	
	

}
