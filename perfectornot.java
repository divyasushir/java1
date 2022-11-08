import java.util.Scanner;
class demo
{
	long n,sum=0;
	int i=1;
	public void read()
	{
           Scanner s=new Scanner(System.in);
           System.out.println("enter the number=");
           n=s.nextLong();
          }
          void display()
          {
			  while (i<=n/2)
			  {
				  if(n%i==0)
				  {
					  sum=sum+i;
				  }
				  i++;
			  }
			  if(sum==n)
			  {
				  System.out.println("number is perfect");

			 }
			 else
			 {
				System.out.println("number is not perferct");
			 }
			 }
}
class perfectornot
{
	public static void main(String args[])
	{
		demo d=new demo();
		d.read();
		d.display();
    }
}