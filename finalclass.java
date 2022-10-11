final class finalclass

{
	void display()
	{
		System.out.println("This is final class method");
	}
}
class main extends finalclass
{
	void display()
{
	System.out.println("The finao method overridden");
}
public static void main(String args[])
{
	main obj=new obj();
	obj.display();
}
}