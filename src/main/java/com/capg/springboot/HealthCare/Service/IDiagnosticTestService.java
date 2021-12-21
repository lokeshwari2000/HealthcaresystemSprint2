package com.capg.springboot.HealthCare.Service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.springboot.HealthCare.Entities.DiagnosticTest;
import com.capg.springboot.HealthCare.Exception.TestNotFoundException;


@Service
public interface IDiagnosticTestService
{
      public List<DiagnosticTest> getAllTest();

      DiagnosticTest addNewTest(DiagnosticTest test);

      DiagnosticTest updateTestDetail(DiagnosticTest test) throws TestNotFoundException;

     

}
