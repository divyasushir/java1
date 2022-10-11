import java.util.Scanner;
class cons
{
    int no1,no2,add;
    Scanner s= new Scanner(System.in);
    cons()
    {
System.out.println("Enter First no=");
no1=s.nextInt();
System.out.println("Enter Second no=");
no2=s.nextInt();
    }
void read()
{
add=no1+no2;
System.out.println("Addition of two no is="+add);
 }
}
public class constructor {
    public static void main(String[] args) {
        cons d1=new cons();
        d1.read();
    }
    
}
