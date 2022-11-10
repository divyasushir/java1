class outer
{
	void outermenthod()
	{
		System.out.println("inside outer class");
		class inner
		{
			public void innermethod()
			{
				System.out.println("inside inner method");
				}
			}
			inner i=new inner();
			i.innermethod();
		}
	}
	class innerclass
	{
		public static void main(String args[])
		{
			outer o=new outer();
			o.outermenthod();
			}
		}