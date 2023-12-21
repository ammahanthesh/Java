package com.kodnest.arrayprograms.level2;
import java.util.Scanner;
public class PrintPositive {
		public static void main(String[] args) {
			System.out.println("Enter Array Length..");
			Scanner scan =new Scanner(System.in);
			int arr[]=new int[scan.nextInt()];
			for(int i=0;i<=arr.length-1;i++)
			{
				arr[i]=scan.nextInt();
			}
			for(int i:arr)
			{
				if(i>=0) {
					System.out.println(i+" ");
				}
			}
		}

	}


