package com.capg.springboot.HealthCare.Service;

import java.util.List;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capg.springboot.HealthCare.Entities.DiagnosticCenter;
import com.capg.springboot.HealthCare.Exception.DiagnosticCenterNotFoundException;
import com.capg.springboot.HealthCare.Repository.IDiagnosticCenterRepository;




@Service
@Transactional  //to begin 
public class DiagnosticCenterServiceImpl implements DiagnosticCenterService {

	@Autowired
    IDiagnosticCenterRepository centerRepository ; 
	
/*****************************************************************************************
  * Method: addDiagnosticCenter
	 * Description: It is used to add DiagnosticCenter into Diagnostic_Center table
	 * @param PolicyHolder: PolicyHolder's reference variable.
	 * @Override: It is used to override the JpaRepository methods for performing CURD operations.
	 * Created E Lokeshwari
     * Created Date -01-12-2021
	 * 
 *******************************************************************************************/
	
	
	@Override
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter)
			throws DiagnosticCenterNotFoundException {
		return centerRepository.save(diagnosticCenter);
		}
	
	
/********************************************************************************************
 * Method: updateDiagnosticCenter
	 * Description: It is used to updateDiagnosticCenter into Diagnostic_Center table
	 * @Override: It is used to override the JpaRepository methods for performing CURD operations.
	 * Created E Lokeshwari
     * Created Date -01-12-2021
	 * 
 *******************************************************************************************/
	
	@Override
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter)
	{	
		return centerRepository.save(diagnosticCenter);
	    }
	
	
/********************************************************************************************
 * Method:removeDiagnosticCenter
	 * Description: It is used to updateDiagnosticCenter into Diagnostic_Center table
	 * @Override: It is used to override the JpaRepository methods for performing CURD operations.
	 * Created E Lokeshwari
     * Created Date -01-12-2021
	 * 
  ****************************************************************************************************/
	
	@Override
	public DiagnosticCenter removeDiagnosticCenter(int id) 
			throws DiagnosticCenterNotFoundException {
		if(!centerRepository.existsById(id)) {
			throw new DiagnosticCenterNotFoundException("Oops !! No DiagnosticCenter found for given Id");
		}
		else {
			DiagnosticCenter diagnosticCenter = centerRepository.findById(id);
		centerRepository.deleteById(id);
		return   diagnosticCenter;
		}	
	}
	
	
/**********************************************************************************************
	 * Method:getAllDiagnosticCenters
	 * Description: It is used to getAllDiagnosticcenter from  Diagnostic_Center table
	 * @Override: It is used to override the JpaRepository methods for performing CURD operations.
	 * Created E Lokeshwari
     * Created Date -01-12-2021
	 * 
* ********************************************************************************************* */
	
	@Override
	public List<DiagnosticCenter> getAllDiagnosticCenters() 
			throws DiagnosticCenterNotFoundException {
		 return centerRepository.findAll();
		
	}

/**********************************************************************************************
	 * Method:getDiagnosticCenter 
	 * Description: It is used to get Diagnosticcenter name from  Diagnostic_Center table
	 * @Override: It is used to override the JpaRepository methods for performing CURD operations.
	 * Created E Lokeshwari
     * Created Date -01-12-2021
	 * 
* ********************************************************************************************* */

	@Override
	public DiagnosticCenter getDiagnosticCenter(String centername) 
			throws DiagnosticCenterNotFoundException {
		DiagnosticCenter diagnosticCenter=centerRepository.findByName(centername);
		return diagnosticCenter;
	}
		
/**********************************************************************************************
	 * Method:getAllDiagnosticCenterById
	 * Description: It is used to getDiagnosticCenter by Id from  Diagnostic_Center table
	 * @Override: It is used to override the JpaRepository methods for performing CURD operations.
	 * Created E Lokeshwari
     * Created Date -01-12-2021
	 * 
* ********************************************************************************************** */	
		
	@Override
	public DiagnosticCenter getDiagnosticCenterById(int diagnosticCenter) {
		DiagnosticCenter diagnosticcenter=centerRepository.findById(diagnosticCenter);
	return diagnosticcenter;
	}

}
