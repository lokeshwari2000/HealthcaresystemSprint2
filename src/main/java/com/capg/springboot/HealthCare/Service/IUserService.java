package com.capg.springboot.HealthCare.Service;



import org.springframework.stereotype.Service;

import com.capg.springboot.HealthCare.Entities.User;



@Service
public interface IUserService {
	
	
	
	public User addUser(User user);
	
	public User removeUser(User user);
	

}
