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
import com.capg.springboot.HealthCare.Entities.DiagnosticTest;
import com.capg.springboot.HealthCare.Exception.DiagnosticCenterNotFoundException;
import com.capg.springboot.HealthCare.Exception.TestNotFoundException;
import com.capg.springboot.HealthCare.Repository.IDiagnosticTestRepository;
import com.capg.springboot.HealthCare.Service.IDiagnosticTestServiceImpl;




@RunWith(SpringRunner.class)
@SpringBootTest
public class DiagnosticTestTestService {
	
	
		@InjectMocks
		private IDiagnosticTestServiceImpl serviceobject;
		
		@Mock
		private IDiagnosticTestRepository test_repo; 
		
		// 1. addDiagnosticCenter() Service Layer Check
		@Test
		public void addNewTest() throws TestNotFoundException {
			
			DiagnosticTest test=new DiagnosticTest();
			test.setId(10);
			test.setNormalValue("100");
			test.setTestName("BloodTest");
			//test.setTestPrice(1200000);
			test.setUnits("20");
			
			
			
			
			Mockito.when(test_repo.save(test)).thenReturn(test);
			
			assertEquals(test, serviceobject.addNewTest(test));
			
		}
		@Test
		public void testupdate() throws TestNotFoundException  {
			DiagnosticTest test=new DiagnosticTest();
			test.setId(10);
			test.setNormalValue("200");
			test.setTestName("BloodTest");
			//test.setTestPrice(1200000);
			test.setUnits("20");
			
			
			
			Mockito.when(test_repo.save(test)).thenReturn(test);
			
			Mockito.when(test_repo.existsById(10)).thenReturn(true);
			test.setNormalValue("200");
			
			DiagnosticTest testDiagnostictest=serviceobject.updateTestDetail(test);
			
			assertEquals(test.getNormalValue(),testDiagnostictest.getNormalValue());
		}
		
}
