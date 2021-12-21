package com.capg.springboot.HealthCare.Service;

import java.util.List;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.capg.springboot.HealthCare.Entities.Appointment;
import com.capg.springboot.HealthCare.Exception.AppointmentNotFoundException;
/*
 * Author : SURAJ BHAVIMANE
 * Date : 02-12-2021
 * Description : This is Appointment Service
*/
@Service
public interface IAppointmentService 
{
	public Appointment addAppointment(Appointment appointment) throws AppointmentNotFoundException;
	
	public Appointment viewAppointment(int appointmentId) throws AppointmentNotFoundException;
	
	public Appointment updateAppointment(Appointment appointment) throws AppointmentNotFoundException;
	
	public Appointment removeAppointment(Appointment appointment)throws AppointmentNotFoundException;
}
