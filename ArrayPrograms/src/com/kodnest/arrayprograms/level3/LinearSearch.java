package com.kodnest.arrayprograms.level3;

public class LinearSearch {
	int linear(int arr[], int num) {
		for(int i=0;i<=arr.length-1;i++)
		{
			if(num==arr[i])
			{
				return i;
			}
		}
		return -1;
	}
	

}
