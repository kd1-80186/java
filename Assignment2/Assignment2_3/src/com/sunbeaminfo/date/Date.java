package com.sunbeaminfo.date;

public class Date 
{
	private int dd;
	private int mm;
	private int yy;
	
	public Date()
	{
		this.dd = 7;
		this.mm = 10;
		this.yy = 2023;
	}
	
	
	public Date(int dd, int mm, int yy)
	{
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}


	public int getDd() {
		return dd;
	}


	public void setDd(int dd) {
		this.dd = dd;
	}


	public int getMm() {
		return mm;
	}


	public void setMm(int mm) {
		this.mm = mm;
	}


	public int getYy() {
		return yy;
	}


	public void setYy(int yy) {
		this.yy = yy;
	}
	
	public void displayDate()
	{
		System.out.println("Date : "+this.dd+"/"+this.mm+"/"+this.yy);
	}

}
