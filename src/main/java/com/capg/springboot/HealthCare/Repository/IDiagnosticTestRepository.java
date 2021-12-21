package com.capg.springboot.HealthCare.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.springboot.HealthCare.Entities.DiagnosticTest;



public interface IDiagnosticTestRepository extends JpaRepository<DiagnosticTest,Integer>{

	
	
	
	}
	