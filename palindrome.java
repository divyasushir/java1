import java.util.Scanner;
class demo
{
int d,s=0,temp,no;
Scanner sc=new Scanner(System.in);
void show()
{
System.out.println("Enter the number=");
no=sc.nextInt();
temp=no;
}
void display()
{
while(no>0)
{
	d=no%10;
	s=s*10+d;
	no=no/10;
}
if(temp==s)
{
	System.out.println("Number is Palindrome");
}
else
{
	System.out.println("Number is not Palindrome");
}
}
}
class palindrome
{
public static void main(String args[])
{
	demo d1=new demo();
	d1.show();
	d1.display();
}
}