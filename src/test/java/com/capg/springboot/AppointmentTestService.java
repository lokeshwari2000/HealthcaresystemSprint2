package com.capg.springboot;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.springboot.HealthCare.Entities.Appointment;
import com.capg.springboot.HealthCare.Exception.AppointmentNotFoundException;
import com.capg.springboot.HealthCare.Repository.AppointmentRepository;
import com.capg.springboot.HealthCare.Service.IAppointmentServiceImpl;



@RunWith(SpringRunner.class)
@SpringBootTest
public class AppointmentTestService {
	
	@InjectMocks
	private IAppointmentServiceImpl iaservice;
	@Mock
	private AppointmentRepository appointRepo;
	

	@Test
	public void addAppointment() throws AppointmentNotFoundException {
		
		Appointment appoint = new Appointment();
		appoint.setId(1);
		appoint.setAppointmentDate(null);
		
		Mockito.when(appointRepo.save(appoint)).thenReturn(appoint);
		
		assertEquals(appoint,iaservice.addAppointment(appoint));
		
	}

}
