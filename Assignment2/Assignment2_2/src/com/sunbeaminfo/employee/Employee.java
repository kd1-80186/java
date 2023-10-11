package com.sunbeaminfo.employee;

import java.util.Scanner;

public class Employee 
{
	private String first_name;
	private String last_name;
	private double salary;
	
	public Employee() {
		this.first_name = " ";
		this.last_name = " ";
		this.salary = 0.0;
	}	
	public Employee(String first_name, String last_name, double salary) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}	
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		first_name = sc.next();
		System.out.println("Enter last name");
		last_name = sc.next();
		System.out.println("Enter monthly salary");
		salary = sc.nextDouble();	
		
	}
	
	
	

}
