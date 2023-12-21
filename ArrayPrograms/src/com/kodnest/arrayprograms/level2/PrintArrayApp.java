package com.kodnest.arrayprograms.level2;

import java.util.Scanner;

public class PrintArrayApp {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Array Length..");
		int arr[]=new int[scan.nextInt()];
		System.out.print("Enter array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		PrintArray p1=new PrintArray();
		p1.printArray(arr);
		}

}
