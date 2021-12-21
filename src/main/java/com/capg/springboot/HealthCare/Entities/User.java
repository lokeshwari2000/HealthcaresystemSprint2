package com.capg.springboot.HealthCare.Entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

@Entity  //give information that table exist in the database
@Table(name="User_Table")   //specifying the table name in database
	public class User
	{
	@Id
	private int id;
	private String username;
	@Column(nullable=false)
	@Length(min=8,max=15)
	private String password;
	@Column(nullable=false)
	private String role;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole()
	{
		return role;
	}
	public void setRole(String role)
	{
		this.role=role;
	}
	@Override
	public String toString()
	{
		return "User [Id=" + id + ", userName="+ username + ", passWord="+ password + ", role= "+role + "]";
	
	}
	}
