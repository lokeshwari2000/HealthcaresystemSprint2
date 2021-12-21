package com.capg.springboot.HealthCare.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="Appointment_menu")
public class Appointment
{
	@Id
	
	private int id;
	private LocalDate appointmentDate;
	
	
	
	public int getid() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	

	
	@Override
	public String toString()
	{
		return "Appointment{" +
	            "id ='" + id + '\'' +
	            ", appointmentDate ='" + appointmentDate + '\'' +"}";
	            	
	}




}
