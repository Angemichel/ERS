package com.revature.p1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.p1.app.Account;
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

	@Override
	public Employee postEmployee(Employee e1) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt;
		Connection conn = Utils.createConnection();
		
		try {
			pstmt = conn.prepareStatement("insert into employee(id,employee_name,request_amount,reason,status) values(default,?,?,?,'Pending')");
			pstmt.setString(1,e1.getName());
			pstmt.setInt(2,e1.getAmount());
			pstmt.setString(3, e1.getReason());
			//pstmt.setString(4, e1.getStatus());
			
			pstmt.execute();
			pstmt.close();
			
		} catch (SQLException e) 
		{
			e.printStackTrace();
	}
		return null;
		//return e1;
		
	}

	@Override
	public Employee updateEmployee(String name, String reason, String status,Employee e1) {
		// TODO Auto-generated method stub
		Connection conn = Utils.createConnection();
		
		try {
			PreparedStatement pstmt;
			pstmt = conn.prepareStatement("update employee set id = default,status=? where employee_name=? and reason=?");
			pstmt.setString(1,status);
			pstmt.setString(2,name);
			pstmt.setString(3,reason);
			pstmt.execute();
			pstmt.close();
			
		} catch (SQLException e) 
		{
			e.printStackTrace();	
			
	}
		return e1;
	}

	@Override
	public Employee updateRequest(Employee e1) {
		// TODO Auto-generated method stub
Connection conn = Utils.createConnection();
		
		try {
			PreparedStatement pstmt;
			pstmt = conn.prepareStatement("update employee set id = default,status=? where employee_name=? and reason=?");
			pstmt.setString(1,e1.getStatus());
			pstmt.setString(2,e1.getName());
			pstmt.setString(3,e1.getReason());
			pstmt.execute();
			pstmt.close();
			
		} catch (SQLException e) 
		{
			e.printStackTrace();	
	}
		return e1;
	}

	@Override
	public ArrayList<Account> getAccount(Account a1) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt;
		ResultSet rs;
		Connection conn = Utils.createConnection();
		ArrayList<Account> aList = new ArrayList<Account>();
		Account a2;
		Account a3;
		
		//Compare a1.getAccpassword() and accpassword to send chosen account
		//Use fetch api to read the account then decide next link should be opened

		
		String selectPassword = "select account_password from accounts where account_name=?";
		
		try {

			pstmt = conn.prepareStatement(selectPassword);
			pstmt.setString(1,a1.getAccname());
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
			String accpassword = rs.getString("account_password");
			a1 = new Account(a1.getAccname(),accpassword,a1.getAccemail());
			aList.add(a1);
			
			/*
			a2 = new Account("","","");
			a3 = new Account(a1.getAccname(),accpassword,a1.getAccemail());
			String pwd = a1.getAccpassword();
			
			if (pwd != accpassword)
			{
				aList.add(a3);
			} else {
				aList.add(a2);
				
			}
			*/	
			}
			
			rs.close();
			pstmt.close();
			
		} catch (SQLException e) 
		{
			e.printStackTrace();	
	}
		return aList;
	}

	@Override
	public ArrayList<Employee> getOneEmployee(Employee e1) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt;
		ResultSet rs;
		Connection conn = Utils.createConnection();
		String selectAllEmployee = "select * from employee where employee_name=?";
	
		ArrayList<Employee> eList = new ArrayList<Employee>();
		
		
		try {
			pstmt = conn.prepareStatement(selectAllEmployee);
			pstmt.setString(1, e1.getName());
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

	@Override
	public ArrayList<Employee> getEmployee(String name) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt;
		ResultSet rs;
		Connection conn = Utils.createConnection();
		String selectEmployee = "select * from employee where employee_name=?";
	
		ArrayList<Employee> eList = new ArrayList<Employee>();
		Employee emp;
		
		
		try {
			pstmt = conn.prepareStatement(selectEmployee);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				name = rs.getString("employee_name");
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

	@Override
	public ArrayList<Employee> getPending() {
		// TODO Auto-generated method stub
		PreparedStatement pstmt;
		ResultSet rs;
		Connection conn = Utils.createConnection();
		String selectAllEmployee = "select * from employee where status='Pending'";
	
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
