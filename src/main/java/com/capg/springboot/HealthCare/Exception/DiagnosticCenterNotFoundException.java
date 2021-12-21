package com.capg.springboot.HealthCare.Exception;

public class DiagnosticCenterNotFoundException extends Exception  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6750196534838678474L;
	public DiagnosticCenterNotFoundException(String msg)
	{
		super(msg);
	}
	public DiagnosticCenterNotFoundException(String msg, Throwable e) {
		super(msg,e);
	}
}
