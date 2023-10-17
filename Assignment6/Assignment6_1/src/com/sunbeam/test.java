package com.sunbeam;

public class test  {

	public static void main(String[] args) 
	{
		StringLength sl = new StringLength();
		try
		{
			sl.Length();
		}
		
		catch (ExceptionLineTooLong e)
		{
			e.printStackTrace();
		}
		
		System.out.println(sl);

	}

}
