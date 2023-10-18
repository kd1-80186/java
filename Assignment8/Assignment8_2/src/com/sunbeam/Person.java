package com.sunbeam;

import java.util.Scanner;

public class Person implements Displayable
{
	private  String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void accept()
	{
		System.out.println("Enter name and age : ");
		Scanner sc = new Scanner(System.in);
		this.name = sc.next();
		this.age = sc.nextInt();
	}
	
	public void show()
	{
		System.out.println("Name :  "+this.name+" Age : "+this.age);
	}

	@Override
	public String toString() {
		return "Date [name=" + name + ", age=" + age + "]";
	} 

}
