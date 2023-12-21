package com.kodnest.arrayprograms.level4;
import java.util.Scanner;
public class SumArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" number of elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		SumArray sumarray=new SumArray();
		int sum=sumarray.sumOfElements(arr);
		System.out.println("sum of all the elements "+sum);
	}
	 int sumOfElements(int arr[]) {
		int sum=0;
		for(int i:arr)
			sum=sum+i;
		return sum;
		/*for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
			return sum;
			
		}*/	
	}
}