package com.capg.springboot.HealthCare.Repository;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.capg.springboot.HealthCare.Entities.Appointment;


public interface AppointmentRepository extends JpaRepository<Appointment,Integer>
{
	public Appointment findById(int appointmentId);
	
}
