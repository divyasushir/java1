import java.util.Scanner;
class demo
{
	int i,no,fact=1;
	Scanner s=new Scanner(System.in);
	void show()
	{
		System.out.println("Enter the no=");
		no=s.nextInt();
	}
	void display()
	{
		for(i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of"+no+"is"+fact);

	}

}
class factorial
{
	public static void main(String args[])
	{
		demo d1=new demo();
		d1.show();
		d1.display();
	}
}