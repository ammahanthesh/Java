import java.util.Scanner;

public class Solution9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		evenPrime(n);
		

	}
	public static void evenPrime(int n) {
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				{
					System.out.println(i);
				}
			}
		}

	}