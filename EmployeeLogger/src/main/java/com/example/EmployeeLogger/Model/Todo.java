package com.example.EmployeeLogger.Model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Todo {
	
	
@GeneratedValue(strategy =GenerationType.IDENTITY)
@Id
int id;
String username;
String description;
String done;
Date date;
public Todo(int id, String username, String description, String done, Date date) {
	super();
	this.id = id;
	this.username = username;
	this.description = description;
	this.done = done;
	this.date = date;
}
public Todo()
{
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getDone() {
	return done;
}
public void setDone(String done) {
	this.done = done;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@Override
public String toString() {
	return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", done=" + done + ", date="
			+ date + "]";
}

}
