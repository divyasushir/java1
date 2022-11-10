import java.util.Scanner;
class string
{
	public static void main(String args[])
	{
		String first="HELLO";
		String second="world";
		System.out.println(first);
		System.out.println(second);

		char ch=first.charAt(0);
		System.out.println("Character at "+ch);

		String upper=second.toUpperCase();
		System.out.println("to upper case"+upper);

		String lower=first.toLowerCase();
		System.out.println("to lower case"+lower);

		String join=first.concat(second);
		System.out.println("join"+join);
	}
}
