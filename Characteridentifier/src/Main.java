import java.util.Scanner;
public class Main {
	public static void identifyCharacter(char ch)
	{
		if (Character.isDigit(ch))
		{
			System.out.println("Entered character "+ch+"is digit");
		}
		else if(!Character.isLetter(ch))
		{
			System.out.println("Entered character"+ch+"is Special Character");
		}
		else
		{
			switch(Character.toLowerCase(ch)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch))
				{
					System.out.println("Entered character"+ch+"is lower case vowel");
				}
				else
				{
					System.out.println("Entered character"+ch+"is upper case vowel");
				}
				break;
		default:
				if(Character.isLowerCase(ch))
				{
					System.out.println("Entered character"+ch+"is lower case consonent");
				}
				else
				{
					System.out.println("Entered character"+ch+"is upper case consonent");
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the char");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
	}
}