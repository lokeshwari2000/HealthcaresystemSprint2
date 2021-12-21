package com.capg.springboot.HealthCare.Service;
import java.util.List;

import java.util.List;

/*
 * Author : SURAJ BHAVIMANE
 * Date : 02-12-2021
 * Description : This is Appointment Service
*/

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.HealthCare.Entities.Appointment;
import com.capg.springboot.HealthCare.Exception.AppointmentNotFoundException;
import com.capg.springboot.HealthCare.Repository.AppointmentRepository;



@Service
@Transactional
public class IAppointmentServiceImpl implements IAppointmentService {
	
/************************************************************************************************************************************************/
	
	@Autowired 
	AppointmentRepository appointment_Repo ;
	public Appointment addAppointment(Appointment appointment) throws AppointmentNotFoundException{
		return  appointment_Repo.save(appointment);
		}           
	/************************************************************************************
		 * Method: addAppointment
		 * Description: It is used to add Appointments into Appointment table
		 * @return Appointment It returns Appointment with details
		 * @Override: It is used to override the JpaRepository methods for performing CURD operations.
		 * Created By-SURAJ BHAVIMANE
	     * Created Date - 02-12-2021
		 * 
		 ************************************************************************************/
	
/************************************************************************************************************************************************/

	@Override
	public Appointment viewAppointment(int appointmentId) throws AppointmentNotFoundException {
		Appointment appointment = appointment_Repo.findById(appointmentId);
		return appointment;
		}          
	
	 /************************************************************************************
   	 * Method: viewAppointment
   	 * Description: It is used to view all Appointments in Appointment table by appointment Id
   	 * @return appointment : It returns allAppointments with details
   	 * @Override:  It is used to override the JpaRepository methods for performing CURD operations.
   	 * Created By- SURAJ BHAVIMANE
     * Created Date - 02-12-2021
   	 * 
   	 ************************************************************************************/
	
/************************************************************************************************************************************************/

	@Override
	public Appointment updateAppointment(Appointment appointment) throws AppointmentNotFoundException {
		return appointment_Repo.save(appointment);
		}          
	
	 /************************************************************************************
		 * Method: updateApointment 
		 * Description: It is used to update Appointment into Appointment table
		 * @Override:  It is used to override the JpaRepository methods for performing CURD operations.
		 * Created By-SURAJ BHAVIMANE
	     * Created Date - 02-12-2021
	     *
		 ************************************************************************************/
	
/************************************************************************************************************************************************/

	@Override
	public Appointment removeAppointment(Appointment appointment) throws AppointmentNotFoundException {
		
		return appointment_Repo.save(appointment);
		}         
	
	/************************************************************************************
	 * Method: removeAppointment 
	 * Description: It is used to remove Appointment from Appointment table
	 * @Override:  It is used to override the JpaRepository methods for performing CURD operations.
	 * Created By- SURAJ BHAVIMANE
     * Created Date- 02-12-2021 
	 * 
	 ************************************************************************************/
	
/************************************************************************************************************************************************/
}
