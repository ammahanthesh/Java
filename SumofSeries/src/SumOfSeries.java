import java.util.Scanner;
public class SumOfSeries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to find sum of digits");
		int n = scan.nextInt();
		sumOfDigits(n);
	}
	public static void sumOfDigits(int n)
	{
		int temp = n;
		int sum = 0;
		while(n!=0)
		{
			int rem = n%10;
			sum = sum+rem;
			n = n/10;
		}
		System.out.println("Sum of digits " +temp+ " is "+sum);
	}

}