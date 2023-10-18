package com.sunbeam;

import java.util.Scanner;

public class Book 
{
	private String sbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book() 
	{
		
	}
	
	public Book(String sbn, double price, String authorName, int quantity) {
		super();
		this.sbn = sbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}


	public String getSbn() {
		return sbn;
	}


	public void setSbn(String sbn) {
		this.sbn = sbn;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Book [sbn=" + sbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}
	
	void accept()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter isbn : ");
		this.sbn = sc.next();
		System.out.println("Enter price : ");
		this.price = sc.nextDouble();
		System.out.println("Enter author : ");
		this.authorName = sc.next();
		System.out.println("Enter quantity : ");
		this.quantity = sc.nextInt();
		
	}
	
	
	

}
