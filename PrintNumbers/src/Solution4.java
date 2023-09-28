import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		displayDivisibleBy2and5(n);
		

	}
	public static void displayDivisibleBy2and5(int n) {
		for(int i=0;i<=n;i++)
		{
			if(i%2==0 && i%5==0)
			System.out.println(i);
		}

	}

}
