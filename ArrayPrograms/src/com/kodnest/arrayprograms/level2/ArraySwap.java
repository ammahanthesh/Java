package com.kodnest.arrayprograms.level2;

import java.util.Scanner;

public class ArraySwap {
	public static void main(String[] args) {
		System.out.println("Enter Array Length..");
		Scanner scan =new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Before Swapping");
		for(int i:arr)
			{
				System.out.println(i+" ");
			}
		System.out.println(" ");
		System.out.println("Enter the index numbers to swap");
	    int a=scan.nextInt();
	    int b=scan.nextInt();
	    int help;
	    help=arr[a];
	    arr[a]=arr[b];
	    arr[b]=help;
	    System.out.println("After swapping");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
			
	    }

}
