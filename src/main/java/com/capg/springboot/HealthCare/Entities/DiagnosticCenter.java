package com.capg.springboot.HealthCare.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //represent the table stored in the databse
@Table(name="Diagnostic_Center") //specifying the table name 
public class DiagnosticCenter{
	@Id   //to drfinr the primarykey
	@GeneratedValue   //automatic creation of id values
	private int id;
	private String name;
	private String contactno;
	private String address;
	private String contactEmail;
	
	
	//Constructing getter and setter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	
}