package com.capg.springboot;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.springboot.HealthCare.Entities.User;
import com.capg.springboot.HealthCare.Exception.UserNotFoundException;
import com.capg.springboot.HealthCare.Repository.IUserRepository;
import com.capg.springboot.HealthCare.Service.IUserServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	@InjectMocks
	private  IUserServiceImpl iUserServiceImpl;
	@Mock
	private IUserRepository iUserRepository;
	
	@Test
	public void addUserTest()
	{
		User user=new User();
		user.setId(01);
		user.setUsername("solgh");
		user.setPassword("prt12345678");
		user.setRole("Patient");
		Mockito.when(iUserRepository.save(user)).thenReturn(user);
		assertEquals(user,iUserServiceImpl.addUser(user));
	}
	
	@Test
	public void removeUserTest() throws UserNotFoundException  {
		User user=new User();
		user.setId(01);
		user.setUsername("solankighosh");
		user.setPassword("Cap123467");
		user.setRole("Admin");
		Mockito.when(iUserRepository.save(user)).thenReturn(user);
		
		
		iUserServiceImpl.removeUser(user);
		
		//verify(iUserRepository,Mockito.atLeastOnce()).delete(user);
		assertEquals(user,iUserServiceImpl.removeUser(user));
	}

}
