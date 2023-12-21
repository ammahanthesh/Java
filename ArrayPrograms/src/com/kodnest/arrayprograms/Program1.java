package com.kodnest.arrayprograms;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println("enter "+i+" element");
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Elements are...");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		
		
			
		}
		
		
	}

}
