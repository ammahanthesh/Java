import java.util.Scanner;

public class BinarySearchApp 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the array of " +i);
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter key to check");
		int key=scan.nextInt();
		BinarySearch bs=new BinarySearch();
		int res=bs.keyCheck(arr,key);
		if(res==-1)
		{
			System.out.println("Key not found");
		}
		else
		{
			System.out.println("Key  Found at the index "+res);
		}
		
	}

}
