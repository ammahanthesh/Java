import java.util.Scanner;

public class InsertionSortApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Elements before insertion sort");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		InsertionSort insertionsort=new InsertionSort();
		insertionsort.insertion(arr);
		System.out.println("Array Elements After insertion sort");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
