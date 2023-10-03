import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key to find in an array");
		int key=scan.nextInt();
		for(int i=1;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				System.out.println("key at the index of "+i);
				return;
			}
		}
		System.out.println("key not found");
	}
}
