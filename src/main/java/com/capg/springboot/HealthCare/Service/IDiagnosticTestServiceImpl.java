package com.capg.springboot.HealthCare.Service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.capg.springboot.HealthCare.Entities.DiagnosticTest;
import com.capg.springboot.HealthCare.Exception.TestNotFoundException;
import com.capg.springboot.HealthCare.Repository.IDiagnosticTestRepository;

import org.springframework.beans.factory.annotation.Autowired;



/*
 * Author : Solanki Ghosh
 * Date: 1/12/21
 * Description : IDiagnosticServiceImpl class
 */

@Transactional
@Service
public class IDiagnosticTestServiceImpl implements IDiagnosticTestService {

	@Autowired 
	IDiagnosticTestRepository test_repo;
	
	/***********************************************************************************************
	 * Method: getAllTest
	 * Description: It is used to get all the test from the Diagnostic_Test table
	 * @Override:Annotation to override the Jpa Repository methods for performing CURD operations
	 * Created by- Solanki Ghosh
	 * Created date-1/12/21 
	 **********************************************************************************************/
	
	
    @Override
    public List<DiagnosticTest> getAllTest()  
      {
        List<DiagnosticTest> diagnostictest=test_repo.findAll();	
       return diagnostictest;
	
      }

    /***********************************************************
     * Method: addNewTest
     * Description:It is used to add test in the Dignostic Table
     * Created by-Solanki Ghosh
     * Created date-1/12/21
     ************************************************************/
    
 
    
    
    @Override
    public DiagnosticTest addNewTest(DiagnosticTest test) 
      { 
	  return test_repo.save(test);
      }

//@Override
//public List<DiagnosticTest> getTestOfDiagnosticCenter(int centerId) 
//{
//return test_repo.findAll();	
//}

    /*****************************************************************************
     * Method:updateTestDetail
     * Description:It is used to update the test details in Diagnostic Table
     * Created by-Solanki Ghosh
     * Created Date-1/12/21
     ******************************************************************************/
    
    
    
    
    
    @Override
    public DiagnosticTest updateTestDetail(DiagnosticTest test) throws TestNotFoundException 
      {
	    if(!test_repo.existsById((test.getId())))
	  {
	    	throw new TestNotFoundException("Opps! No Test found for given Id");
	  }
	    else
	  {
	    	return test_repo.save(test);
	  }
}


}

