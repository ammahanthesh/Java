import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		evenDivisibleBy3(n);
		

	}
	public static void evenDivisibleBy3(int n) {
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				if(i%3==0)
				{
					System.out.println(i);
				}
			}
		}
	}
}