package com.sunbeam;

import java.util.Scanner;

public class Circle 
{
	private double diameter;
	private Point2D point;
	
	public Circle() {
		super();
		this.diameter = 100;
		this.point = new Point2D(0,0);
	}

	@Override
	public String toString() {
		return "Circle [diameter=" + diameter + ", point=" + "(" +point.getX_point()+"," + point.getY_point()+ ")" + "]";
	}
	
	void acceptData() throws NonNegativeDiameterException
	{
		point.acceptData();
		
		System.out.println("Enter diameter");
		Scanner sc = new Scanner(System.in);
		this.diameter = sc.nextDouble();
		if(this.diameter<0)
			throw new NonNegativeDiameterException("Diameter", diameter, "Diameter should be greater than 0");
		
		
	}

	
}
