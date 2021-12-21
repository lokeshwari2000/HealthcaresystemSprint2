package com.capg.springboot.HealthCare.Exception;


public class TestNotFoundException  extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5270458372488335631L;
	public TestNotFoundException(String msg)
	{
		super(msg);
	}
	public TestNotFoundException(String msg, Throwable e) {
		super(msg,e);
	}
}
