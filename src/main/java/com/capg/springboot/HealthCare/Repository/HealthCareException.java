package com.capg.springboot.HealthCare.Repository;

// HealthCareSystemException is responsible to handle all custom exceptions related to HealthCareSystem App.

public class HealthCareException extends RuntimeException {


		
	public HealthCareException(String msg, Throwable e) {
		super(msg, e);
	}
	public HealthCareException(String msg) {
		super(msg);
	}
	public HealthCareException(Throwable e) {
		super(e);
	}
}