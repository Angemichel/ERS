package com.revature.p1.app;

public class Employee {
	private String name;
	private int amount;
	private String reason;
	private String status;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Employee(String name, int amount, String reason, String status) {
		super();
		this.name = name;
		this.amount = amount;
		this.reason = reason;
		this.status = status;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", amount=" + amount + ", reason=" + reason + ", status=" + status + "]";
	}
	
	
	
}
