/*3. In above assignment use TreeSet instead of LinkedHashSet. Use natural ordering for the Book. If any book with duplicate isbn is added, what will happen?
Books are stored in which order?*/

/*
 	1Q. If any book with duplicate isbn is added, what will happen?
 		It will get added to HashSet bcoz equals() and hashCode() methods are not written inside class Book.
   		To resolve duplicate values problem , write equals() and hashCode() methods inside class book. 
   		
    2Q.  Books are stored in which order?
   		 Alphabetically sorted order
 * 
 * 
 * 
 * 
 * */
package com.sunbeam;

import java.util.*;

public class BookTest {

	public static void main(String[] args) 
	{
		 
		//TreeSet uses comparator or comparable interfaces to 
		// check for duplicates.(In case of natural ordering use comparable)
		 
		//TreeSet does not use hashCode() and equals() methods 
		//to check for duplicates
		
		//If we do not write code for comparable then it will throw 
		//java.lang.ClassCastException error.
		
		//Output is in alphabetical sorted order
		TreeSet<Book> set = new TreeSet<>();
		
		set.add(new Book("1a",100.12, "Anjali", 1));
		set.add(new Book("1c",200.13, "Ajay", 2));
		set.add(new Book("1d",300.14, "Sulochana", 3));
		set.add(new Book("1b",400.15, "Vishnu", 4));
		set.add(new Book("1e",500.12, "Shamal", 5));
		set.add(new Book("1a",600.12, "Ami", 6));
		

		Iterator<Book> itr = set.iterator();
		while(itr.hasNext())
		{
			Book ele = itr.next();
			System.out.println(ele);
		}			
		
	}	
}


