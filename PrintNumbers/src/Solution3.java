import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		display(n);
		

	}
	public static void display(int n) {
		for(int i=0;i<=n;i++)
		{
			if(i%5==0)
			System.out.println(i);
		}

	}

}
