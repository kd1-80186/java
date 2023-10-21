package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferInput {

	public static void main(String[] args) 
	{	
		try(FileWriter fw = new FileWriter("LineData.bin")){
		try(BufferedWriter bwr = new BufferedWriter(fw)){
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=4; i++)
		{
			System.out.println("Enter line :");
			String line = sc.nextLine();
			bwr.write(line);
			bwr.newLine(); // adds \n
			}
		System.out.println("Lines are written into the file");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
