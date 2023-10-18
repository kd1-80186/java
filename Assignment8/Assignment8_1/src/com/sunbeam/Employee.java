package com.sunbeam;

import java.util.*;
abstract public class Employee {
	private String first_name;
	
	abstract public double CalculateSalary();
	
	public Employee()
	{
		
	}
	
	public Employee(String first_name) {
		
		this.first_name = first_name;
		
	}


	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	

	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First name = ");
		this.first_name=sc.next();
		
	}
	public void displayData() {
		System.out.println("Frist_name = "+this.first_name);
		
	}

	@Override
	public String toString() {
		return "Employee [first_name=" + first_name + "]";
	}
	
	
	
	
}
