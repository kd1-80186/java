package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class TestStudent {

	public static void main(String[] args) 
	{
		//array of student class
		Student[] s = new Student[6];
		 s[0] = new Student(10,"Anjali","Karad",66.12);
		 s[1] = new Student(20,"Gauri","satara",78.54);
		 s[2] = new Student(30,"SWaroopa","pune",96.56);
		 s[3] = new Student(40,"Akanksha","mumbai",85.76);
		 s[4] = new Student(50,"Nivedita","pune",96.56);
		 s[5] = new Student(60,"Shamal","satara",66.12);
		 
		 System.out.println("After sorting ");
		 for(Student student : s )
		 {
			 System.out.println(student);
		 }
		
		 //local class
		 class CompareStudent implements Comparator<Student>
		{

			@Override
			public int compare(Student s1, Student s2)
			{
				int diff = - s1.getCity().compareTo(s2.getCity());
				if(diff == 0)
					diff = -(Double.compare(s1.getMarks(), s2.getMarks()));
				if(diff == 0)
					diff = s1.getName().compareTo(s2.getName());
				return diff;
			}			
		}
		 
		 //class obj
		 CompareStudent comparator = new CompareStudent();
		 
		 //printing obj
		 System.out.println("After sorting ");
		 Arrays.sort(s,comparator);
		 for(Student student : s )
		 {
			 System.out.println(student);
		 }
	}

}
