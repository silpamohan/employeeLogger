package com.example.EmployeeLogger.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Project {
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy =GenerationType.IDENTITY)
	 */
	int projectid;
	
	int accountid;
	
	String projectname;
	
	String managerid;
	
	int headaccount;
	
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getManagerid() {
		return managerid;
	}
	public void setManagerid(String managerid) {
		this.managerid = managerid;
	}
	public int getHeadaccount() {
		return headaccount;
	}
	public void setHeadaccount(int headaccount) {
		this.headaccount = headaccount;
	}
	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", accountid=" + accountid + ", projectname=" + projectname
				+ ", managerid=" + managerid + ", headaccount=" + headaccount + "]";
	}
	
	
	
	
}
