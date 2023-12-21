package com.kodnest.arrayprograms.level4;
import java.util.Scanner;
public class ReplaceApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array-1 Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" number of elements which includes both +ve and -ve numbers");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Elements Before Replacing negative numbers with zero");
		for (int x : arr) 
		{
			System.out.print(x+" ");
		}
		Replace replace=new Replace();
		replace.arrayReplace(arr);
		System.out.println();
		System.out.println("Array Elements After Replacing negative numbers with zero");
		for (int x : arr) 
		{
			System.out.print(x+" ");
		}
	}
}