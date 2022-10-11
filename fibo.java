import java.util.Scanner;
class demo
{
int no1,no2,no,nextno,i;
Scanner s=new Scanner(System.in);
void read()
{
System.out.println("Enter the number=");
no=s.nextInt();
}
void show()
{
no1=0;
no2=1;
System.out.println(no1);
System.out.println(no2);
for (i=2;i<=no;i++)
{
	nextno=no1+no2;
	System.out.println(nextno);
	no1=no2;
	no2=nextno;
}
	}

}
class fibo
{
public static void main(String args[])
{
	demo d=new demo();
	d.read();
	d.show();
}
}