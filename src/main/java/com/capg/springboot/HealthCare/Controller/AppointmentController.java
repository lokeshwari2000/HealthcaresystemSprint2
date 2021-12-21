package com.capg.springboot.HealthCare.Controller;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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

import com.capg.springboot.HealthCare.Entities.Appointment;
import com.capg.springboot.HealthCare.Exception.AppointmentNotFoundException;
import com.capg.springboot.HealthCare.Service.IAppointmentServiceImpl;



@RestController
@RequestMapping("/Appointment")
public class AppointmentController {
	
	@Autowired 
	IAppointmentServiceImpl serviceobj ;
	
	
/************************************************************************************************************************************************/
    
	@PostMapping(path = "/addAppointment")
	public ResponseEntity<Appointment> addAppointment(@RequestBody Appointment appointment) throws AppointmentNotFoundException
	{
		if(appointment.getid()==0)
		{
			return new ResponseEntity("Invalid Id",HttpStatus.NOT_FOUND);
		}
		Appointment appointImpl = serviceobj.addAppointment(appointment);
		return new ResponseEntity(appointImpl,HttpStatus.OK);
	}
	
	/****************************
	 * Method: addAppointment
	 * Description: It is used to add Appointment into Appointment table
	 * @PostMapping: It is used to handle the HTTP POST requests matched with given URI expression.
	 * @RequestBody: It used to bind the HTTP request/response body with a domain object in method parameter or return type.
	 * Created By- SURAJ BHAVIMANE
     * Created Date - 02-12-2021 
	 * 
	 ****************************/
	
/************************************************************************************************************************************************/
	
	@GetMapping(path="/viewAppointment")
	public ResponseEntity <Appointment> viewAppointment(@PathVariable("appointmentId") int appointmentId) throws AppointmentNotFoundException
	{
		Appointment appointmentImpl = serviceobj.viewAppointment(appointmentId);
		return new ResponseEntity <Appointment>(appointmentImpl,new HttpHeaders(),HttpStatus.OK);
		
	}
	
	/****************************
	 * Method: viewAppointment 
	 * Description: It is used to view all Appointment in Appointment table
	 * @GetMapping:It is used to handle the HTTP get requests matched with given URI Expression
	 * @PathVariable: It is used to handle template variables in the request URI mapping.
	 * Created By- SURAJ BHAVIMANE
     *Created Date- 02-12-2021
	 * 
	 ****************************/

/************************************************************************************************************************************************/
	
	
	@PutMapping(path = "/updateAppointment")
	public ResponseEntity<Appointment> updateAppointment(@RequestBody Appointment appointment) throws AppointmentNotFoundException
	{
		if(appointment == null)
		{
			return new ResponseEntity("Enter valid product details",HttpStatus.NOT_FOUND);
		}
		Appointment appoint = serviceobj.updateAppointment(appointment);
		return new ResponseEntity(appoint,HttpStatus.OK);
	}
	
	/****************************
	 * Method: updateAppointment
	 * Description: It is used to update Appointment into Appointment table
	 * @return Appointment It returns Appointments with details
	 * @PutMapping:It is used to handle the HTTP PUT requests matched with given URI Expression
	 * @RequestBody: It used to bind the HTTP request/response body with a domain object in method parameter or return type.
	 * Created By- SURAJ BHAVIMANE
     *Created Date - 02-12-2021 
	 * 
	 ****************************/
	
	
/************************************************************************************************************************************************/
	
	
	@DeleteMapping("/removeAppointment")
	public Appointment removeAppointment(Appointment appointment) throws AppointmentNotFoundException
	{
		Appointment appointdel = serviceobj.removeAppointment(appointment);
		return appointdel;
	}	
	
	/****************************
	 * Method: DeleteAppointment
	 * Description: It is used to remove Appointment from Appointment table
	 * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with given URI expression.
	 * Created By- SURAJ BHAVIMANE
     *Created Date - 02-12-2021
	 * 
	 ****************************/
	
/************************************************************************************************************************************************/
}
