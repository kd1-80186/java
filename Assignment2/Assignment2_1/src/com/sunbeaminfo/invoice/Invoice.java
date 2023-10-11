package com.sunbeaminfo.invoice;

import java.util.Scanner;

public class Invoice 
{
	private String partNo;
	private String description;
	private int quantity;
	private double price;
	
	public Invoice() {
		
		this.partNo =" ";
		this.description = " ";
		this.quantity = 0;
		this.price = 0.0;
	}
	
	public Invoice(String partNo, String description, int quantity, double price) {
		
		this.partNo = partNo;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartno() {
		return partNo;
	}

	public void setPartno(String partno) {
		this.partNo = partno;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter part number");
		partNo = sc.next();
		System.out.println("Enter desription");
		description = sc.next();
		System.out.println("Enter quantity");
		quantity = sc.nextInt();
		if(this.quantity<=0)
		{
			this.setQuantity(0);
		}
		System.out.println("Enter price");
		price = sc.nextDouble();
		if(this.price<=0)
		{
			this.setPrice(0.0);	
		}
	}
	
	public double calculateAmount()
	{
		double amount;
		amount = this.quantity*this.price;
		return amount;
		
	}
	
		 

	
}
