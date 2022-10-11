import java.util.Scanner;
interface method

{
void read();
void calculate();
}
class num implements method
{
int a,b,c;
Scanner s=new Scanner(System.in);
public void read()
{
System.out.println("Enter the number=");
a=s.nextInt();
System.out.println("Enter the second number =");
b=s.nextInt();
}
public void calculate()
{
	c=a+b;
	System.out.println("Addition is="+c);
}
}
public class interface1
{
	public static void main(String args[])
	{
		num n1=new num();
		n1.read();
		n1.calculate();
	}
}