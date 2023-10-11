package com.app.geomerty;

public class Point2Dtest {

	public static void main(String[] args) 
	{
		Point2D p1 = new Point2D();
		System.out.println("First point");
		p1.acceptData();
		
		Point2D p2 = new Point2D();
		System.out.println("Second point");
		p2.acceptData();
				
		if(p1.isEqual(p2))
		{
			System.out.println("Both the points are located at same position");
			System.out.print("First point : ");
			p1.displayData(); 
			System.out.print("Second point : ");
			p2.displayData();
		}
		else
		{
			System.out.println("Distance between two points is : "+p1.calculateDistance(p2));
		}
		
	}
}
