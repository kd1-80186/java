/*5. Store Books in HashMap<> so that for given isbn, book can be searched in fastest possible time. Do we need to write equals() and hashCode() in Book
class?*/

/*
 	1Q. Do we need to write equals() and hashCode() in Book class?
 		No, we do not have to  write equals() and hashCode() inside book class because as key is of String type,
 		String class has its own equals() and hashCode() methods which it uses to generate hascode.
 */

package com.sunbeam;

import java.util.*;

public class BookTest {

	public static void main(String[] args) 
	{
		 Map<String,Book> map = new HashMap<>();
		 int choice;
		 Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println("**********************************");
			System.out.println("1. Accept book ");
			System.out.println("2. Retrive book using isbn code");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				
			case 0: System.out.println("Thank you");
					break;
					
			case 1: 
					Book b1 = new Book();
					b1.accept();
					map.put(b1.getIsbn(), b1);
					System.out.println("Book added successfully");
					break;
					
			case 2: 
					System.out.println("Enter isbn to search book : ");
					String sbn = sc.next();
					Book b = map.get(sbn);
					if(b != null)
					{
					System.out.println(b);
					}
					else 
						System.out.println("Invalid isbn code");
					break;
					
			default : 
					System.out.println("Invalid index");
					break;
			}
					
		}while(choice!=0);

	}	
}




