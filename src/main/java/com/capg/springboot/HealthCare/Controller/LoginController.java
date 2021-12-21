package com.capg.springboot.HealthCare.Controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.HealthCare.Entities.Patient;
import com.capg.springboot.HealthCare.Service.IPatientService;



//PatientController is a class to handle food item requests
@RestController
@RequestMapping("/patient")
@CrossOrigin("http://localhost:8081")

public class LoginController {
	
	@Autowired
	private IPatientService iPatientService;
	/*-----------------------------------------------------------------------------------------------*/	
    
	 /*Registering new patient
	 * @method RegisterPatient()
	 * @objective of the method is to register new patient
	 * @return Patient
	 */
	
	@PostMapping("/register")
	public ResponseEntity<Patient> RegisterPatient(@RequestBody Patient patient) {
		
		iPatientService.registerPatient(patient);
		ResponseEntity<Patient> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		return responseEntity;	
	}
	/*-----------------------------------------------------------------------------------------------*/	
    
	 /*Udpating new patient
	 * @method updatePatientDetails()
	 * @objective of the method is to update new patient
	 * @return Patient
	 */
	
	@PutMapping("/updatepatient")
	public ResponseEntity<Patient> updatePatientDetails(@RequestBody Patient patient ) {
		if(patient==null)
			return new ResponseEntity("Enter Proper Patient Details",HttpStatus.NOT_FOUND);
		return new ResponseEntity(iPatientService.updatePatientDetails(patient),HttpStatus.OK);
	}
	/*-----------------------------------------------------------------------------------------------*/	
	
	
}
