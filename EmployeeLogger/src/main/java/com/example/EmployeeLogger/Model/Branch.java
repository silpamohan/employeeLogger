package com.example.EmployeeLogger.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Branch {
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy =GenerationType.IDENTITY)
	 */	int branchid;
	
	String Branchname;
	
	int Accountid;
	
	String Accountname;
	
	
	public int getBranchid() {
		return branchid;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	public String getBranchname() {
		return Branchname;
	}
	public void setBranchname(String branchname) {
		Branchname = branchname;
	}
	public int getAccountid() {
		return Accountid;
	}
	public void setAccountid(int accountid) {
		Accountid = accountid;
	}
	public String getAccountname() {
		return Accountname;
	}
	public void setAccountname(String accountname) {
		Accountname = accountname;
	}
	
	
	

}
