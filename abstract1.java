abstract class demo
{
	int a,b;
	void get()
	{
		a=20;
		b=30;
	}
	abstract public void show();

}
class demo1 extends demo
{
	 public void show()
	 {
		System.out.println(a*b);

	 }
}
class abstract1
{
	public static void main(String args[])
	{
		demo1 d1=new demo1();
		d1.get();
		d1.show();
	}
}