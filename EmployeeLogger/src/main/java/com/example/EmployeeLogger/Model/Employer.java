package com.example.EmployeeLogger.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Employer {
	
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 */
	int id;
	
	String companyName;
	
	List<String> branchNames;
	
	String Country;
	
    long mobile;
	
    String mailid;

	public Employer(int id,String companyName,String Country , List<String> branchNames, int mobile, String mailid) {
		
		this.id=id;
		this.companyName=companyName;
		this.branchNames=branchNames;
		this.Country=Country;
		this.mobile=mobile;
		this.mailid=mailid;
		
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<String> getBranchNames() {
		return branchNames;
	}

	public void setBranchNames(List<String> branchNames) {
		this.branchNames = branchNames;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	@Override
	public String toString() {
		return "Employer [id=" + id + ", companyName=" + companyName + ", branchNames=" + branchNames + ", Country="
				+ Country + ", mobile=" + mobile + ", mailid=" + mailid + "]";
	}	
	
	
	
	

}
