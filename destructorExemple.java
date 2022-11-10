
class demo
{
	demo(int x)
	{
		System.out.println(x);
	}
	protected void finalize()
	{
		System.out.println("object is destroyed by garbage collecter");

	}

}
class destructorExemple
{
	public static void main(String args[])
	{
		demo d=new demo(10);

		d.finalize();
		d=null;
	}
}