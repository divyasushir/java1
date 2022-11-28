import java.util.Scanner;
class student
{
	int rollno;
	String name;
	static String college="imrd";
	student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	void display()
	{
		System.out.println(rollno+name+college);
	}
}
class static1
{
	public static void main(String args[])
	{
		student s=new student(12,"prachi");
		s.display();
	}
}