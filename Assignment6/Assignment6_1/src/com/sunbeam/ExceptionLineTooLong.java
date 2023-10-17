package com.sunbeam;

public class ExceptionLineTooLong extends Exception //checked exception
{
	String fieldName;
	String fieldValue;
	
	ExceptionLineTooLong()
	{
		
	}
	
	public ExceptionLineTooLong(String fieldName, String fieldValue) {
		super();
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
	public ExceptionLineTooLong(String fieldName, String fieldValue, String message) {
		super(message);
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	@Override
	public String toString() 
	{
		return "ExceptionLineTooLong [fieldName=" + fieldName + ", fieldValue=" + fieldValue + "]"+super.getMessage();
	}
	
	
	
	
	
	

}
