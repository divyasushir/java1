class move
{
	public void show()
	{
		int a=10;
		int b=20;
		System.out.println(a*b);
	}

}
class move1 extends move
{
	public void show()
	{
		super.show();
		System.out.println(20);

	}
}
class methodoverriding
{
	public static void main(String args[])
	{
		move1 m=new move1();
		m.show();
	}
}