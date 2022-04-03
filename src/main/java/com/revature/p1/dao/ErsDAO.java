package com.revature.p1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.revature.p1.app.Employee;
import com.revature.p1.app.Utils;

public class ErsDAO implements ErsDaoInt {

	@Override
	public ArrayList<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		PreparedStatement pstmt;
		ResultSet rs;
		Connection conn = Utils.createConnection();
		String selectAllEmployee = "select * from employee";
	
		ArrayList<Employee> eList = new ArrayList<Employee>();
		
		
		try {
			pstmt = conn.prepareStatement(selectAllEmployee);
			rs = pstmt.executeQuery();
			Employee emp;
			
			while(rs.next()) {
				String name = rs.getString("employee_name");
				int amount = rs.getInt("request_amount");
				String reason = rs.getString("reason");
				String status = rs.getString("status");
				emp = new Employee(name,amount,reason,status);
				eList.add(emp);
				
			}
			rs.close();
			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return eList;
	}

}
