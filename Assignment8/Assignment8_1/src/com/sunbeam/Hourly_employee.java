package com.sunbeam;

import java.util.*;
public class Hourly_employee extends Employee {
	private int wage;
	private int hours;
	
	public Hourly_employee()
	{
		super();
	}
	
	public Hourly_employee(String first_name,int wage, int hours) {
		super(first_name);
		this.wage=wage;
		this.hours=hours;
	}
	
	@Override
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		super.acceptData();
		System.out.println("Enter the Hourly wage = ");
		this.wage=sc.nextInt();
		System.out.println("Enter the Hours Worked = ");
		this.hours=sc.nextInt();
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Hourly_wage = "+this.wage);
		System.out.println("Hours_Worked = "+this.hours);
	}

	@Override
	public String toString() {
		return "Hourly_employee [wage=" + wage + ", hours=" + hours + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double CalculateSalary() {
		if(this.hours<=40)
		{
			System.out.println(" Regular Salary = "+(this.wage*this.hours));
		}
		else
			if(this.hours>40)
		{
			System.out.println("overtime salary= "+(40*this.wage+(this.hours-40)*this.wage*1.5));
		}
		return (this.wage*this.hours);
		
		
	}
	
	

}