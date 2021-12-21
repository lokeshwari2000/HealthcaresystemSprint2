package com.capg.springboot.HealthCare.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.capg.springboot.HealthCare.Entities.DiagnosticTest;
import com.capg.springboot.HealthCare.Exception.TestNotFoundException;
import com.capg.springboot.HealthCare.Service.IDiagnosticTestServiceImpl;




/*Controller Class for DiagnosticTest
  Author:Solanki Ghosh
  Date Created :1/12/21
 */


@RestController
@RequestMapping("/DiagnosticTest")
public class DiagnosticTestController {
	@Autowired
	IDiagnosticTestServiceImpl serviceobject;
	

	
/***********************************************************************************************/	
	
	
	//Get all the test 
	/*@method getAllTest()
	 @Objective of the method is to get all the diagnostic test from database
	 @return List of Diagnostic Test
	 */
	@GetMapping(path="/getAll")
	public ResponseEntity<List<DiagnosticTest>> getAllTest()
	{
		List<DiagnosticTest> lst=serviceobject.getAllTest();
		if(lst.isEmpty())
		{
			return new ResponseEntity("No diagnostic test present", HttpStatus.NOT_FOUND);
			
		}
		return new ResponseEntity<List<DiagnosticTest>>(lst,HttpStatus.OK);
	}
	
	
/*********************************************************************************************************/	
	
	
	//Adding new test
	/*@method addNewTest()
	 @Objective of the method is to add new test in the database
	 @return HttpStatus NOT FOUND if price is equal to zero
	 else return list of diagnostic test that are added to the database
	 */
	
	@PostMapping("/testCreation")
	public ResponseEntity<DiagnosticTest> addNewTest(@RequestBody DiagnosticTest test)
	{
//		if(test.gettestPrice()==0)
//			return new ResponseEntity("Invalid",HttpStatus.NOT_FOUND);
//		DiagnosticTest t=serviceobject.addNewTest(test);
		return new ResponseEntity(serviceobject.addNewTest(test),HttpStatus.OK);
	}
	
	
/****************************************************************************************************/	
	
	
	
	@PutMapping("/testUpdate")
	public ResponseEntity<DiagnosticTest> updateTestDetail(@RequestBody DiagnosticTest test) throws TestNotFoundException
	{
		if(test==null)
			return new ResponseEntity("Enter proper test details",HttpStatus.NOT_FOUND);
		return new ResponseEntity(serviceobject.updateTestDetail(test),HttpStatus.OK);
	}
	
	
/****************************************************************************************************************************************/
	
	
	
	
}

