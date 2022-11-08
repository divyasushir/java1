import java.util.Scanner;
class string
{
public static void main(String args[])
{
	String first="Hello";
	String second="world";
	String third="WORLD";
	System.out.println("first="+first);
	System.out.println("second="+second);

	//charAt function
	char ch=first.charAt(0);
	System.out.println("character at="+ch);

	//upper string
	String upperStr=second.toUpperCase();
	System.out.println("upper case is="+upperStr);

	//lower string
	String lowerStr=first.toLowerCase();
	System.out.println("lower case is="+lowerStr);

	//join two string

	String join=first.concat(second);
	System.out.println("join string"+join);

	//get the length of string

   int length=join.length();
   System.out.println("length ="+length);

   //compare first and second string

   boolean result1=first.equals(second);
   System.out.println("string first and second are equal="+result1);



}
}