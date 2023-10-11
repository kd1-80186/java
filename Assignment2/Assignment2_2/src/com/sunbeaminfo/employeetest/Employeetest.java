package com.sunbeaminfo.employeetest;

import com.sunbeaminfo.employee.Employee;

public class Employeetest {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.acceptData();
		if(e1.getSalary()<=0)
		{
			e1.setSalary(0);
		}
		
		double yearly_salary=e1.getSalary()*12;
		System.out.println("Yearly salary of first person : "+yearly_salary);
		
		double hike_salary = yearly_salary + yearly_salary*0.1;
		System.out.println("Yearly salary of first person after 10% hike : "+hike_salary);
		
		Employee e2 = new Employee();
		e2.acceptData();
		if(e2.getSalary()<=0)
		{
			e2.setSalary(0);
		}
		
		double yearly_salary1=e2.getSalary()*12;
		System.out.println("Yearly salary of second person : "+yearly_salary1);
		
		double hike_salary1 = yearly_salary1 + yearly_salary1*0.1;
		System.out.println("Yearly salary of second person after 10% hike : "+hike_salary1);
		

	}

}
