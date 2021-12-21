package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//It is a component scan but basically it will scan only the sub packages
@SpringBootApplication
public class HealthCareSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareSystemApplication.class, args);
		System.out.println( "SpringBoot Server Starts...");
	}
	
	

}
