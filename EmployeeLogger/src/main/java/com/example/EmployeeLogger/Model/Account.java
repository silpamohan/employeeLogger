package com.example.EmployeeLogger.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Account {
	
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 */
	int Accountid;
	
	String accountname;
	
	String DeliverypartnerName;
	
	int odc;
	
	String floor;
	
	String Projectname;
	
	int headcount;

}
