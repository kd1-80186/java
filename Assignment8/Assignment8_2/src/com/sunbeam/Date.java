package com.sunbeam;

import java.util.Scanner;

public class Date implements Displayable
{
private int day;
private int month;
private int year;



public Date(int day, int month, int year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
}

void accept()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter day, month, year");	
	this.day = sc.nextInt();
	this.month = sc.nextInt();
	this.year = sc.nextInt();
}

public void show()
{
	System.out.println("Date : "+this.day+"/"+this.month+"/"+this.year);
	
}
	
}
