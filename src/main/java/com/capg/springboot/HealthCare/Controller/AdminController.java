package com.capg.springboot.HealthCare.Controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.HealthCare.Entities.User;
import com.capg.springboot.HealthCare.Service.IUserServiceImpl;





/*Controller Class for DiagnosticTest
Author:Solanki Ghosh
Date Created :1/12/21
*/




@RestController
@RequestMapping("/Authenticate")
@CrossOrigin(origins="http://loccalhost:9090")
public class AdminController {
	@Autowired HttpSession session;
    @Autowired IUserServiceImpl iUserServiceImpl;
	/*******************************************************************************************/

    
	//To check whether criteria is matching or not 
	/*@method check()
	 @Objective of the method is to check whether criteria is matching or not
	 @return ok
	 */
    
    @GetMapping("/Check")
    public String check()
    {
    	return "ok";
    }
    
    /**********************************************************************************************/
    
  //To add user to the User_Table
  	/*@method addUser()
  	 @Objective of the method is to add user to the table
  	 @return the user those were added
  	 */
    
    
    
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user)
    {
    	return iUserServiceImpl.addUser(user);
    }
  
    /***************************************************************************************************/
    
  //To remove user from the User_Table
  	/*@method remove()
  	 @Objective of the method is to remove user from  the table
  	 @return message as Removed
  	 */
    
    
    
    @DeleteMapping("/remove")
    public ResponseEntity<String> remove()
    {
    	session.invalidate();
    	return new ResponseEntity<String>("Removed",HttpStatus.OK);
    }
    
    /****************************************************************************************************/
}

