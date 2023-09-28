import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		oddDivisibleBy5(n);
		

	}
	public static void oddDivisibleBy5(int n) {
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				if(i%5==0)
				{
					System.out.println(i);
				}
			}
		}

	}

}
