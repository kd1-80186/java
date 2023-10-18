package com.sunbeam;

import java.util.*;

public class ArrayString {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList();
		Collections.addAll(list,"Anjali","Sulochana","Ajay","Vishnu","Shamal" );
		
		//Local class
		class CompareArray implements Comparator<String>
		{

			@Override
			public int compare(String s1, String s2) 
			{
				int diff = s1.length() - s2.length();
				return diff;
			}
			
		}
		
		CompareArray comparator = new CompareArray();
		
		System.out.println("Max string in the list is : "+Collections.max(list,comparator));	

	}

}
