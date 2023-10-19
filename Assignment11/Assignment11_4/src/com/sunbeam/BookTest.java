/**/


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
		class BookPriceComparator implements Comparator<Book>
		{

			@Override
			public int compare(Book d1, Book d2) 
			{
				int diff = Double.compare(d1.getPrice(),d2.getPrice());
				return diff;
			}
			
		}
		
		BookPriceComparator priceComparator = new BookPriceComparator();
		TreeSet<Book> set = new TreeSet<>(priceComparator);
		
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
		
		System.out.println();
		
		System.out.println("After using decending iterator");
		Iterator<Book> itr1 = set.descendingIterator();
		while(itr1.hasNext())
		{
			Book ele = itr1.next();
			System.out.println(ele);
		}	
	}	
}



