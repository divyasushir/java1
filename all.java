
import java.util.Scanner;
class demo
{
int num;
Scanner s1=new Scanner(System.in);
void read()
{
    System.out.println("Enter the number=");
    num=s1.nextInt();
}
void factorial()
{
    int fact=1;
    for(int i=1;i<=num;i++)
    {
        fact=fact*i;
    }
    System.out.println("fact is="+fact);
}
void even_odd()
{
    if (num%2==0)
    {
    System.out.println("Nnumber is even");
    }
    else
    {
        System.out.println("Nnumber is  odd");
    }
}
void prime()
{
    int c=0;
    for(int i=1;i<=num;i++)
    {
        if (num%i==0)
        {
            c++;
        }
    }
    if (c==2)
    {
        System.out.println("Nnumber is prime");
    }
    else
    {
        System.out.println("Nnumber is not prime");
    }
}
}
 public class all
{
    public static void main(String args[])
    {
        demo d1=new demo();
        d1.read();
        d1.even_odd();
        d1.prime();
    }
}
