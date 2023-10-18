package com.sunbeam;

import java.util.Comparator;

public class TestArray
{
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
		}
		}

	public static void main(String[] args)
	{

		class CompareDoubleArray implements Comparator<Double>
		{
			@Override
			public int compare(Double a1, Double a2) 
			{
				if(a1>a2)
					return 1;
				else
					return 0; 
			}
			
		}
		
		CompareDoubleArray comparator = new CompareDoubleArray();
		Double[] arr1 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		System.out.println("Before sort");
		for(double ele : arr1)
			System.out.println(ele);
		
		System.out.println("After sort");
		selectionSort(arr1, comparator );
		for(double ele : arr1)
			System.out.println(ele);
		
		
	}

}
