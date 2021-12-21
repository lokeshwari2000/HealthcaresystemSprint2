package com.capg.springboot.HealthCare.Repository;

//DiagnosticCenter repository class
import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.HealthCare.Entities.DiagnosticCenter;
import com.capg.springboot.HealthCare.Exception.DiagnosticCenterNotFoundException;


public interface IDiagnosticCenterRepository extends JpaRepository<DiagnosticCenter,Integer> {

	public DiagnosticCenter findByName(String centername);

	public DiagnosticCenter findById(int diagnosticCenter);

	
	
	
	

	
	

}
