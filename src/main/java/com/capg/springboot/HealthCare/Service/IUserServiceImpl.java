package com.capg.springboot.HealthCare.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.HealthCare.Entities.User;
import com.capg.springboot.HealthCare.Repository.IUserRepository;




/*
 * Author : Solanki Ghosh
 * Date: 1/12/21
 * Description : IDiagnosticServiceImpl class
 */



@Service
@Transactional
public class IUserServiceImpl implements IUserService {
	@Autowired
	IUserRepository  iUserRepository;
	
	
	
	/***********************************************************************************************
	 * Method: addUser
	 * Description: It is used to add all the user to the User_Test table
	 * @Override:Annotation to override the Jpa Repository methods for performing CURD operations
	 * Created by- Solanki Ghosh
	 * Created date-1/12/21 
	 **********************************************************************************************/
	
	
	@Override
	public User addUser(User user)
	{
		return iUserRepository.save(user);
	}
	
	/***********************************************************************************************
	 * Method: removeUser
	 * Description: It is used to remove  user from the User_Test table
	 * @Override:Annotation to override the Jpa Repository methods for performing CURD operations
	 * Created by- Solanki Ghosh
	 * Created date-1/12/21 
	 **********************************************************************************************/
	
	
	
	
	@Override
	public User removeUser(User user)
	{
		return iUserRepository.save(user);
	}
	
	

}
