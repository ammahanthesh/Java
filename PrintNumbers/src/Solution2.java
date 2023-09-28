import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		displayOdd(n);
		

	}
	public static void displayOdd(int n) {
		for(int i=0;i<=n;i++)
		{
			if(i%3==0)
			System.out.println(i);
		}
	}

}
