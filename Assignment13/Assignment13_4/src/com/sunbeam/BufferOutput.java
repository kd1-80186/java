package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferOutput {

	public static void main(String[] args) 
	{
		try(FileReader fr = new FileReader("/home/sunbeam/Desktop/cdac_course/Student_data/JAVA_course/Assignments/Assignment13/Assignment13_3/LineData.bin"))
		{
			try(BufferedReader bwr = new BufferedReader(fr))
			{
				String line;
				
				while((line = bwr.readLine())!=null)
				{
					System.out.println(line);
				}

		
			}
		}
		catch(Exception e)
			{
				e.printStackTrace();
			}

	}

}


