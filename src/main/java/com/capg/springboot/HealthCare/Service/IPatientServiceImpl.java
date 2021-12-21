package com.capg.springboot.HealthCare.Service;

import javax.transaction.Transactional;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capg.springboot.HealthCare.Entities.Patient;
import com.capg.springboot.HealthCare.Repository.HealthCareException;
import com.capg.springboot.HealthCare.Repository.IPatientRepository;




//IPatientServide interface

@Transactional
@Service
public class IPatientServiceImpl implements IPatientService {

	@Autowired
	IPatientRepository iPatientRepository;
	/*-----------------------------------------------------------------------------------------------------------------------------------*/
    //Overriding the interface in serviceImpl for accessing 
    //here new patient is being registered 
	
	@Override
	public Patient registerPatient(Patient patient) throws HealthCareException {
		Patient patientobj=iPatientRepository.save(patient);
		return patientobj;
	}
	/*-----------------------------------------------------------------------------------------------------------------------------------*/
	//Overriding the interface in serviceImpl for accessing.
    //here we are updating the patient incse of mistake or updating any value.
	@Override
	public Patient updatePatientDetails(Patient patient) throws HealthCareException {
		// TODO Auto-generated method stub
		Patient patientobj=iPatientRepository.save(patient);
		return patientobj;
	}
	
	/*-----------------------------------------------------------------------------------------------------------------------------------*/
	

	
}
