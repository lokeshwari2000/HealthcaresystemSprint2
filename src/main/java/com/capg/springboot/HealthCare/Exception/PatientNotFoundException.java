package com.capg.springboot.HealthCare.Exception;

public class PatientNotFoundException extends Exception {
	
	public PatientNotFoundException(String msg) {
		super(msg);
	}
	public PatientNotFoundException(String msg, Throwable e) {
		super(msg,e);
	}

}