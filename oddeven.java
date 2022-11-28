import java.util.Scanner;
class demo
{
	int no;
	Scanner s=new Scanner(System.in);
	void read()
	{
		System.out.println("Enter the number");
		no=s.nextInt();

		}
		void display()
		{
			if(no%2==0)
			{
			System.out.println("even");
			}
			else
			{
				System.out.println("odd");
		    }
		}
}
class oddeven
{
	public static void main(String args[])
	{
		demo d=new demo();
		d.read();
		d.display();
	}

}