import java.util.Scanner;
public class Powersq 
{
	public static int squareNumber(int num)
	{
		return num*num;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scan.nextInt();
		int result=squareNumber(num);
		System.out.println(result);
	}
}