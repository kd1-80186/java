/*Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
strings is too long". Write a program that reads a String from user and calculates its length. and
throws an exception of type ExceptionLineTooLong in the case where a string of length is more
than 80 characters.
(Hint- Use String class length() method)*/


package com.sunbeam;

import java.util.Scanner;

public class StringLength 
{
	
	private String s;
	
	public void Length() throws ExceptionLineTooLong
	{
		System.out.print("Enter string : ");
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		  	if(s.length() > 80)
		  		throw new ExceptionLineTooLong("s", s, "Charachters should be less than 80");  	
	}

	@Override
	public String toString() {
		return "StringLength [s=" + s + "]";
	}
 
}

