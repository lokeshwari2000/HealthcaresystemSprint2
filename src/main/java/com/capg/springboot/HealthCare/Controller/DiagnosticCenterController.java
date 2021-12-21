package com.capg.springboot.HealthCare.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.capg.HealthCare.Exception.TestNotFoundException;
import com.capg.springboot.HealthCare.Entities.DiagnosticCenter;
import com.capg.springboot.HealthCare.Exception.DiagnosticCenterNotFoundException;
import com.capg.springboot.HealthCare.Service.DiagnosticCenterService;
/*
 Controller Class for Diagnostic Center
 Author:E Lokeshwari
 Date created : 01-12-2021
 */

@RestController  //getting information from controller and http protocols(response body)
@RequestMapping("/Diagnostic_center")
public class DiagnosticCenterController {

     


     @Autowired  //connecting the classes,,//enables automatic dependency injection
     DiagnosticCenterService  iService;
     
 /***************************************************************************************/
     //update the information of avaliable data
     
    @PutMapping(path="/update")
       public DiagnosticCenter updateDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter ) throws DiagnosticCenterNotFoundException{
    	  return iService.updateDiagnosticCenter(diagnosticCenter);
      }
    
    
  /***************************************************************************************/
    //getting the data by id
    //@pathvariable to get specific information by id 
	@GetMapping("/getdiagnosticCenterById/{id}")  
	public ResponseEntity<DiagnosticCenter> getAllDiagnosticCenter(@PathVariable("id") int id) throws DiagnosticCenterNotFoundException{
	    DiagnosticCenter diagnosticcenter=iService.getDiagnosticCenterById(id);
	    return  new ResponseEntity<DiagnosticCenter>(diagnosticcenter,new HttpHeaders(),HttpStatus.OK);
        }
	
/********************************************************************************************/
	// deleting the information by Id
	@DeleteMapping(path="/delete/{id}")
	public DiagnosticCenter deleteDiagnosticCenter(@PathVariable("id") int id) throws DiagnosticCenterNotFoundException {
		return iService.removeDiagnosticCenter(id);
		}
	
/*******************************************************************************************/
	//getting all information regarding DiagnosticCenter
	@GetMapping("/viewAllDiagnosticCenter")
	public ResponseEntity<List<DiagnosticCenter>>findAllDiagnosticCenter() throws DiagnosticCenterNotFoundException {
		List<DiagnosticCenter> diagnosticCenterList = iService.getAllDiagnosticCenters();
		if (diagnosticCenterList.isEmpty()) {
			return new ResponseEntity("No DiagnosticCenter present", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<DiagnosticCenter>>(diagnosticCenterList, HttpStatus.OK);
	}
	
/*********************************************************************************************/
	//creating the information manually in postman
	@PostMapping(path="/add") 
	public ResponseEntity<DiagnosticCenter> addDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter) throws DiagnosticCenterNotFoundException {
		 return ResponseEntity.ok(iService.addDiagnosticCenter(diagnosticCenter));
		}
	
	
/*********************************************************************************************/
	//getting name of diagnosticCenter
	@GetMapping("/diagnosticCenterName/{centername}")
	public ResponseEntity<DiagnosticCenter> findDiagnosticCenter( String centername) throws DiagnosticCenterNotFoundException{
		DiagnosticCenter diagnosticCenter =iService.getDiagnosticCenter(  centername );
		return new ResponseEntity <DiagnosticCenter>(diagnosticCenter,new HttpHeaders(),HttpStatus.OK);
		
	}
	
}




	


	
