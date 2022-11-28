import java.util.Scanner;
class prime1
{
    int no,i,z;
    Scanner s=new Scanner(System.in);
    void get()
    {
        System.out.println("Enter the number=");
        no=s.nextInt();

    }
    void display()
    {
       for(i=2;i<no;i++)
       {
		   if(no%i==0)
	   {
		   z=1;
		   break;
	   }
	   z=0;

	   }
	   if(z==0)
        {
            System.out.println("Number is Prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}

public class prime12 {
    public static void main(String[] args) {
        prime1 p1=new prime1();
        p1.get();
        p1.display();
    }

}
