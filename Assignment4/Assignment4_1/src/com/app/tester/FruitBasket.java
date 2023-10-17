package com.app.tester;

import java.util.Scanner;

import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args) 
	{
		int choice;
		int counter=0;
		int basket_size;
		System.out.print("Enter basket size : ");
		Scanner sc = new Scanner(System.in);
		basket_size = sc.nextInt();
		Fruit basket[] =  new Fruit[basket_size];
		do 
		{	
		System.out.println("**************************************************");
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display names of all fruits in the basket.");
		System.out.println("5.Display name,color,weight , taste of all fresh fruits , in the basket.");
		System.out.println("6.Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7.Mark a fruit as stale");
		System.out.println("8.Mark all sour fruits stale (optional)");
		System.out.print("Enter your choice : ");
		choice=sc.nextInt();
		System.out.println("***************************************************");
		
		switch(choice)
		{
		case 0: System.out.println("Thank you for using this app "); 
				break;
				
		case 1: 
				if(counter < basket_size)
					basket[counter] = new Mango();
					basket[counter].acceptData();
					counter++;
					System.out.println("Mango added to basket");
				
				break;
				
		case 2: 
				if(counter < basket_size)
					basket[counter] = new Orange();
				    basket[counter].acceptData();
				    counter++;
				    System.out.println("Orange added to basket");
				break;
				
		case 3 : 
				if(counter < basket_size)
					basket[counter] = new Apple();
				    basket[counter].acceptData();
				    counter++;
				    System.out.println("Apple added to basket");
				break;
				
		case 4 : System.out.println("Names of all fruits");
				for(int i =0; i < basket_size;i++)
					{	
					System.out.println(basket[i].getName());
					}
				break;
				
		case 5 : for(Fruit f: basket)
		         if(f!=null)
		         {		
				 System.out.println("Fruits : "+f);
				 System.out.println("Taste of fruit : "+f.taste()); 
				 System.out.println("is fruit Fresh? "+f.isFresh());
				 }
				break;
				
		case 6 : for(Fruit f : basket)
					{
				    if(f.isFresh() == false )
				    	{
				    		System.out.println("Taste of stale fruit is "+f.taste());
				    	}
					}
				    System.out.println("No stale fruit present in the basket");
				  break;
				  
		case 7 : int index;
				 System.out.println("Which fruit do you want to mark as stale?");
				 index = sc.nextInt();
				 if(index < counter)
				 {	
					basket[index].setFresh(false);				
				 }
				 break;
				 
		case 8 : 
				for(int i=0;i<counter;i++)
				{
					if(basket[i].taste()=="sour")
						basket[i].setFresh(false);
				}
//				for(Fruit f : basket)
//					{			
//					if(f.taste() == "Sour")
//						{
//							f.setFresh(false);
//						}
//					}
				  break;
				  
		default :
			     System.out.println("Invalid choice...");
			     break;		
		
		}
		
		}while(choice!=0);
		
		
	}

}
