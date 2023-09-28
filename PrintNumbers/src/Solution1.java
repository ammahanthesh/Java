import java.util.Scanner;
public class Solution1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		displayEven(n);
		

	}
	public static void displayEven(int n) {
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			System.out.println(i);
		}
	}

}
