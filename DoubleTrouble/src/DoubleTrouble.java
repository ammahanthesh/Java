import java.util.Scanner;
public class DoubleTrouble 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int result=doubleTheNumber(num);
		System.out.println(result);
	}
		public static int doubleTheNumber(int num)
		{
			return num*2;
		}
}