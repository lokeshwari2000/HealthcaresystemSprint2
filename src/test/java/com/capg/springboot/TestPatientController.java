package com.capg.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.springboot.HealthCare.Entities.Patient;
import com.capg.springboot.HealthCare.Exception.PatientNotFoundException;
import com.capg.springboot.HealthCare.Repository.IPatientRepository;
import com.capg.springboot.HealthCare.Service.IPatientServiceImpl;



/*Patient Controller Test
Author : Devsmita Pal
Date Created : 02/12/2021*/

@RunWith(SpringRunner.class)
@SpringBootTest

public class TestPatientController {
	
	@InjectMocks
	private IPatientServiceImpl iPatientServiceImpl;
	@Mock
	private IPatientRepository iPatientRepository;
	
	
	// 1. registerPatient Service layer Check
	
	@Test
	public void registerPatientTest()throws PatientNotFoundException{
		Patient patient = new Patient();
		patient.setPatientid(01);
		patient.setName("Debjyoti Pal");
		patient.setPhoneNo("0975843527");
		patient.setAge(14);
		patient.setGender("Male");
		Mockito.when(iPatientRepository.save(patient)).thenReturn(patient);
		assertEquals(patient,iPatientServiceImpl.registerPatient(patient));
	}
	
	// 2. updatePatient Service layer Check
	@Test
	public void updatePatientTest() throws PatientNotFoundException{
		Patient patient = new Patient();
		patient.setPatientid(01);
		patient.setName("Shani Pal");
		patient.setPhoneNo("8976543527");
		patient.setAge(15);
		patient.setGender("Male");
		Mockito.when(iPatientRepository.save(patient)).thenReturn(patient);
		Mockito.when(iPatientRepository.existsById(01)).thenReturn(true);
		Patient testpatient=iPatientServiceImpl.updatePatientDetails(patient);
		assertEquals(patient,testpatient);
	}
}
