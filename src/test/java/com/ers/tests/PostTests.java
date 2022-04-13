package com.ers.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.revature.p1.app.Employee;
import com.revature.p1.dao.ErsDAO;

public class PostTests {
	ErsDAO ed = new ErsDAO();
	
	@Test
	public void EmployeeTest() {
		Employee e1 = new Employee ("Kevin Durant",350,"Health","");
		Employee e2 = ed.postEmployee(e1);
		
		Assertions.assertEquals(e1.getName(), e2.getName());
		
	}
	
}
