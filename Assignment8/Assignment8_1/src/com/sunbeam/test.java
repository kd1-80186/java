package com.sunbeam;

class TestSal<T extends Employee>
{ 
	private T data;
	
	public void set(T obj)
	{
		this.data = obj; 
	}
	
	public T get()
	{
		return this.data;
	}
	public double getCalculateSalary()
	{
		return data.CalculateSalary();
		
	}
}
	

public class test
{
	
	
	public static void main(String[] args) 
	{
		CommissionEmployee c = new CommissionEmployee();
		c.acceptData();
		c.displayData();
		TestSal<CommissionEmployee> t1 = new TestSal<>();
		t1.set(c);
		System.out.println(" Commission of Employee : "+t1.getCalculateSalary()); 
		
		Hourly_employee h = new Hourly_employee();
		h.acceptData();
		h.displayData();
		TestSal<Hourly_employee> t2 = new TestSal<>();
		t2.set(h);
		System.out.println(" Hourly salary of Employee : "+t2.getCalculateSalary()); 
		
		Salaried_employee s = new Salaried_employee();
		s.acceptData();
		s.displayData();
		TestSal<Salaried_employee> t3 = new TestSal<>();
		t3.set(s);
		System.out.println("salary of Employee : "+t3.getCalculateSalary()); 			

	}
}

