package com.kodnest.arrayprograms.level3;

import java.util.Scanner;

public class LinearSearchApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter a key to search in Array");
		int key=scan.nextInt();

		LinearSearch l1=new LinearSearch();
		int result =l1.linear(arr, key);
		if(result>=0)
		{
			System.out.println("key found at index "+result);
		}
		else
		{
			System.out.println("Key not found");
		}
	}
}

