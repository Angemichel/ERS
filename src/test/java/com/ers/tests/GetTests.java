package com.ers.tests;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.revature.p1.app.Employee;
import com.revature.p1.dao.ErsDAO;

public class GetTests {
	ErsDAO dao = new ErsDAO();
	
	@Test
	public void getAllRequestsTest() {
		Employee e1 = new Employee ("Kyrie Irving",250,"Health","Pending");
		Employee e2 = new Employee ("Ben Simmons",150,"Health","Pending");
		
		ArrayList<Employee> l1 = new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		
		ArrayList<Employee> l3 = new ArrayList<>();
		l3.add(e1);
		
		
		ArrayList<Employee> l2 = dao.getAllEmployee();
		Assertions.assertEquals(l1.get(0).getName(),l2.get(0).getName());
	
		//Try assertEqualsAll
	}

}
