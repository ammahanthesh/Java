package com.kodnest.arrayprograms.level2;

public class PrintArray {
	void printArray(int arr[])
	{
		System.out.println("Array Elements in forward direction");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		System.out.println();
		System.out.println("Array Elements in reverse");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
