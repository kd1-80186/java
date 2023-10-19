package com.sunbeam;



import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book>
{
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book()
	{
		
	}
	
	public Book(String isbn, double price, String authorName, int quantity) 
	{
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
		return "BookDetails [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity="
				+ quantity + "]";
	}
	
	public void accept()
	{
		System.out.println("Enter isbn:");
		Scanner sc=new Scanner(System.in);
		isbn=sc.next();
		System.out.println("Enter price:");
		price=sc.nextDouble();
		System.out.println("Authorname:");
		authorName=sc.next();
		System.out.println("Enter Quantity");
		quantity=sc.nextInt();	
	}
	
	
	//for natural ordering
		@Override
		public int compareTo(Book b1) 
		{
			int diff = this.getIsbn().compareTo(b1.getIsbn());
			return diff;
		}
		


}



