import java.util.Scanner;
class demo
{
int a,rem,large=0;
Scanner s=new Scanner(System.in);
void get()
{
System.out.println("enter the no");
a=s.nextInt();
}
void show()
{
while(a>0)
{
rem=a%10;
if(rem>large)
{
large=rem;
}
a=a/10;
}
System.out.println(large);
}
}
public class large1
{
public static  void main(String args[])
{
demo d=new demo();
d.get();
d.show();
}
}