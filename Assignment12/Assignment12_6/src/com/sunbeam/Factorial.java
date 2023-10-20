package com.sunbeam;

import java.util.Scanner;
import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args)
	{

		Stream<Integer> strm = Stream.iterate(1, x->x+1).limit(6);
		int result = strm.reduce(1, (a,b)->a*b);
		System.out.println("Factorial : "+result);
		

	}

}
