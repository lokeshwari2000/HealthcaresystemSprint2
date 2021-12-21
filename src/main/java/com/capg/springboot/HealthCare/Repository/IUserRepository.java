package com.capg.springboot.HealthCare.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.springboot.HealthCare.Entities.User;


@Repository
public interface IUserRepository extends JpaRepository<User, String>{

}