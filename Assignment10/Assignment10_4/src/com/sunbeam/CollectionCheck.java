package com.sunbeam;

import java.util.*;

public class CollectionCheck {

	public static void main(String[] args) 
	{
		//Collection<String> c = new ArrayList<>();
		//null,duplicates are allowed,output is in same order of inserting
		
		
		//Collection<String> c = new HashSet<>(); 
		//duplicates are not allowed, null is allowed which is at the very first position in o/p, o/p alphabetical order
		
		
		//Collection<String> c = new LinkedHashSet<>();
		//output is in same order of inserting, null value is added at the last,duplicates are not allowed
		
		Collection<String> c = new TreeSet<>();
		//Null values are not allowed, o/p in alphabetical order
		
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
//		c.add(null);
//		c.add(null);
//		c.add(null);
		System.out.println(c.toString());

	}

}
