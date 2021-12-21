package com.capg.springboot.HealthCare.Service;

import java.util.List;



import org.springframework.stereotype.Service;

import com.capg.springboot.HealthCare.Entities.Patient;
import com.capg.springboot.HealthCare.Repository.HealthCareException;



@Service //Performing service task

//IPatientServide interface
public interface IPatientService {
	
	//Abstract methods defined to perform CURD operation
	
	public Patient registerPatient(Patient patient) throws HealthCareException;
	
	public Patient updatePatientDetails(Patient patient) throws HealthCareException;
	
	

	
}
