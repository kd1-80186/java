package com.sunbeam;

import java.util.*;

public class Salaried_employee extends Employee {
	private double weeklySalary;
	
	public Salaried_employee()
	{
		super();
	}

	public Salaried_employee(String first_name,double weeklySalary) {
		super(first_name);
		this.weeklySalary=weeklySalary;
	}
	
	
	public double getWeeklySalary() {
		return weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}


	@Override
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		super.acceptData();
		System.out.println("Enter the weeklySalary = ");
		this.weeklySalary=sc.nextDouble();
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Weekly_Salary = "+this.weeklySalary);
	}

	@Override
	public String toString() {
		return "Salaried_employee [weeklySalary=" + weeklySalary + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double CalculateSalary() {
		
		 return weeklySalary;
		
	}
	
}
