package com.sunbeam;

public class NonNegativeDiameterException extends Exception
{
	String fieldname;
	double fieldValue;
	
	public NonNegativeDiameterException(String fieldname, double fieldValue, String message ) {
		super(message);
		this.fieldname = fieldname;
		this.fieldValue = fieldValue;
	}

	@Override
	public String toString() {
		return "NonNegativeDiameterException [fieldname=" + fieldname + ", fieldValue=" + fieldValue + "]"+super.getMessage();
	}
	
	
	
}
