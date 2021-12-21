package com.capg.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.springboot.HealthCare.Entities.DiagnosticCenter;
import com.capg.springboot.HealthCare.Exception.DiagnosticCenterNotFoundException;
import com.capg.springboot.HealthCare.Repository.IDiagnosticCenterRepository;
import com.capg.springboot.HealthCare.Service.DiagnosticCenterService;
import com.capg.springboot.HealthCare.Service.DiagnosticCenterServiceImpl;






@RunWith(SpringRunner.class)
@SpringBootTest
public class DiagnosticCenterTestService {
	
	@InjectMocks
	private DiagnosticCenterServiceImpl  iService;
	@Mock
	private IDiagnosticCenterRepository centerRepository ; 
	
	// 1. addDiagnosticCenter() Service Layer Check
	@Test
	public void addDiagnosticCenterTest() throws DiagnosticCenterNotFoundException {
		
		DiagnosticCenter center=new DiagnosticCenter();
		center.setId(10);
		center.setName("Vijaya");
		center.setContactno("984746373");
		center.setAddress("uppal");
		center.setContactEmail("vijaya@gmail.com");
		
		
		
		
		Mockito.when(centerRepository.save(center)).thenReturn(center);
		
		assertEquals(center, iService.addDiagnosticCenter(center));
		
	}
	
	@Test
	public void testupdate() throws DiagnosticCenterNotFoundException  {
		DiagnosticCenter center=new DiagnosticCenter();
		center.setId(1);
		center.setName("Satya");
		center.setContactno("984746373");
		center.setAddress("uppal");
		center.setContactEmail("vijaya@gmail.com");
		
		
		
		Mockito.when(centerRepository.save(center)).thenReturn(center);
		
		Mockito.when(centerRepository.existsById(1)).thenReturn(true);
		center.setName("Vijaya");
		
		DiagnosticCenter testDiagnosticCenter=iService.updateDiagnosticCenter(center);
		
		assertEquals(center.getName(),testDiagnosticCenter.getName());
	}
}
	
