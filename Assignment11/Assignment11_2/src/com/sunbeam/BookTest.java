/*2. In above assignment use LinkedHashSet instead of HashSet. If any book with duplicate isbn is added, what will happen? Books are stored in which order?*/

/*
  1Q.  If any book with duplicate isbn is added, what will happen? 
  		It will get added to HashSet bcoz equals() and hashCode() methods are not written inside class Book.
   		To resolve duplicate values problem , write equals() and hashCode() methods inside class book. 
   		
   2Q. Books are stored in which order?
   	  Books are stored in order of insertion

  */
package com.sunbeam;

import java.util.*;

public class BookTest {

	public static void main(String[] args) 
	{
		 
		//LinkedHashset will take duplicate values if there is no overriden 
		// equals() and hashCode() methods inside class Book.
		
		//LinkedHashset will not take duplicate values if there are overriden 
		// methods(equals() and hashCode()) inside class Book.
		
		//Books are stored in order of insertion
		
		Set<Book> set = new LinkedHashSet<>();
		
		set.add(new Book("1a",100.12, "Anjali", 1));
		set.add(new Book("1b",200.13, "Ajay", 2));
		set.add(new Book("1c",300.14, "Sulochana", 3));
		set.add(new Book("1d",400.15, "Vishnu", 4));
		set.add(new Book("1e",500.12, "Shamal", 5));
		set.add(new Book("1a",100.12, "Anjali", 1));
		
		Iterator<Book> itr = set.iterator();
		while(itr.hasNext())
		{
			Book ele = itr.next();
			System.out.println(ele);
		}	
	}	
}

