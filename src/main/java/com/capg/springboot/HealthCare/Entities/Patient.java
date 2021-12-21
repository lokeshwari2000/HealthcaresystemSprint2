package com.capg.springboot.HealthCare.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
	
	@Id
	// generates the id automatically
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name="patientId")
	private int patientid;
	private String name;
	private String phoneNo;
	private int age;
	private String gender;
	
	
	// Generating constructor
	public Patient() {
		super();
		
	}
	
	
	
	//Generating getter and setter methods
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	//Generate toString()
	
	@Override
	public String toString() {
		return "Patient [patientId=" + patientid + ", Name=" + name + ", phoneNo=" + phoneNo + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	
}
