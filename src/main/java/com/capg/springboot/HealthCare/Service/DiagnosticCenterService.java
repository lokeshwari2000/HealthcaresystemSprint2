package com.capg.springboot.HealthCare.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capg.springboot.HealthCare.Entities.DiagnosticCenter;
import com.capg.springboot.HealthCare.Exception.DiagnosticCenterNotFoundException;
//it will provide the business logic
@Service
public  interface  DiagnosticCenterService {
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) throws DiagnosticCenterNotFoundException;

	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter) throws DiagnosticCenterNotFoundException;
	
	public DiagnosticCenter removeDiagnosticCenter(int id) throws DiagnosticCenterNotFoundException;
	
	public List<DiagnosticCenter> getAllDiagnosticCenters() throws DiagnosticCenterNotFoundException;
	
    public DiagnosticCenter getDiagnosticCenterById(int diagnosticCenter);
    
    public DiagnosticCenter getDiagnosticCenter(String centername) throws DiagnosticCenterNotFoundException;
    
    
	


	
}
