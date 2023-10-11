/*Q2. Copy the Point2D class , along with the package from previous assignment.
a) Create a class "TestPointArray1.java" in "tester" package for the following
b) Accept , how many no of points to plot from user.
c) Create suitable data structure
Hint : Point2D[] points=new Point2D[sc.nextInt()];
d) Prompt user for x & y co ordinates n store the data suitably
Hint : for loop
e) Supply Menu to user with various Options like following
1. Display details of a specific point
User i/p : index
O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
2) Display x, y co-ordinates of all points
Hint : for-each
3) User i/p : 2 indices for the points , validate the indices
Display distance between specified points (iff they are not located at the same position)
eg : sop("Enter index of strt point n end point");
validation : boundary condition (0<=index<length-1)
isEqual -- false --compute distance --display it.
4. Exit*/


package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of points to plot :");
		Point2D[]  p = new Point2D[(sc.nextInt())];
		
		for (int i = 0;i<p.length;i++)
		{
			p[i] = new Point2D();
		}
		
		for (int i = 0;i<p.length;i++)
		{
			p[i].acceptData();
		}
		
		int choice;
		do 
		{	System.out.println("********************************");
			System.out.println("1. Display details of specific point ");
			System.out.println("2. Display details of all point ");
			System.out.println("3. Display distance between two points ");
			System.out.println("4. Exit ");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();	
			
			switch(choice)
			{
			case 1 : int c;  
				     System.out.print("Enter index to view details of specific points : ");
					 c = sc.nextInt();
					 p[c].displayData();
					 break;
					 
			case 2 : System.out.println("******All points******");
				 		for(int i=0;i<p.length;i++)
						{
							p[i].displayData();
						}
				 		break;
				 		
			case 3 : System.out.print("Enter two indexes to find distance between two points ");
			         int a = sc.nextInt();
			         int b = sc.nextInt();
			         if(a < p.length && b< p.length)
			         {
			         if(p[a].isEqual(p[b]))
			         {
			        	 System.out.println("Both the points are at same position");
			         }
			         else 
			         {
			        	 p[a].calculateDistance(p[b]);
			         }
			         }
			         else 
			         {
			        	 System.out.println("Invalid indexes");
			         }
			         break;
			}
		    }while(choice !=0);
		
		
		
		
	}
}
