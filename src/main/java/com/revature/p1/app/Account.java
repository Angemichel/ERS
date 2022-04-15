package com.revature.p1.app;

public class Account {
	private String Accname;
	private String Accpassword;
	private String Accemail;
	public String getAccname() {
		return Accname;
	}
	public void setAccname(String accname) {
		Accname = accname;
	}
	public String getAccpassword() {
		return Accpassword;
	}
	public void setAccpassword(String accpassword) {
		Accpassword = accpassword;
	}
	public String getAccemail() {
		return Accemail;
	}
	public void setAccemail(String accemail) {
		Accemail = accemail;
	}
	public Account(String accname, String accpassword, String accemail) {
		super();
		Accname = accname;
		Accpassword = accpassword;
		Accemail = accemail;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [Accname=" + Accname + ", Accpassword=" + Accpassword + ", Accemail=" + Accemail + "]";
	}
	
	

}
