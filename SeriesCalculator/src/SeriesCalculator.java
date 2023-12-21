import java.util.Scanner;
public class SeriesCalculator {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number");
			int n = scan.nextInt();
			double res = series(n);
			System.out.println("Answer = "+res);
		
		}
		
		public static double series(int n)
		{
			double sum = 0.0;
			for(int i=1; i<=n; i++)
			{
				 double ans = (1.0/i);
				 sum = sum+ans;
			 
			}
			return sum;
		}
	}