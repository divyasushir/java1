import java.util.Scanner;
class demo
{
	int no,r,sum=0,temp;
	Scanner s=new Scanner(System.in);
	void read()
	{
		System.out.println("Enter the number=");
		no=s.nextInt();
		temp=no;

	}
	void show()
	{
		sum=0;
		while(no>0)
		{
			r=no%10;
			sum=sum+r*r*r;
			no=no/10;

		}
		if (temp==sum)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}
	}

}
class armstrong
{
	public static void main(String args[])
	{
		demo d=new demo();
		d.read();
		d.show();
	}
}