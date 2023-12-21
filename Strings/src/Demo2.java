
public class Demo2 {
	public static void main(String[] args) {
		String s1=new String("samrat");
		String s2=new String("SAMRAT");
		if(s1==s2)
		{
			System.out.println("References are equal");
		}
		else 
		{
			System.out.println("References are not equal");
		}
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}

}
