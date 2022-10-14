import java . util.Scanner;
public class array
{
	public static void main(String args[])
	{
		int m,n,c,d;
		Scanner s=new Scanner(System.in);

		System.out.println("Input numbers of rows of matrix");
		m=s.nextInt();
		System.out.println("Input numbers of colunmns of matrix");
		n=s.nextInt();

		int array1[][]=new int[m][n];
		int array2[][]=new int[m][n];
		int sum[][]=new int[m][n];

	System.out.println("Input elements of first matrix=");

	for(c=0;c<m;c++)
	{
		for(d=0;d<n;d++)
		{
			array1[c][d]=s.nextInt();
		}
	}
	System.out.println("Input elements of second matrix=");

		for(c=0;c<m;c++)
		{
			for(d=0;d<n;d++)
			{
			array2[c][d]=s.nextInt();
	}
}

  for(c=0;c<m;c++)
  {
	  for(d=0;d<n;d++)
	  {
	  sum[c][d]=array1[c][d]+array2[c][d];
  }
  }
	  System.out.println("sum of matrix is=");

		  for (c=0;c<m;c++)
		  {
			  for(d=0;d<n;d++)

			  System.out.print(sum[c][d]+"\t");

			  System.out.println();



}
		  }
	  }

