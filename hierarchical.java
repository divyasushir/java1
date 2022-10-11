import java.util.Scanner;
class demo
{
    int a,b;
    void read()
    {
        a=10;
        b=20;
    }
}
class mul extends demo
{
  public void multiplication()
{
    System.out.println("Multiplication is="+(a*b));
}
}
class add extends demo
{
    public void addition() 
    {
        System.out.println("Addition is="+(a+b));
    }
}
public class hierarchical
{
public static void main(String args[]) 
{
    mul m1=new mul();
    m1.read();
    m1.multiplication();
    add a1=new add();
    a1.read();
    a1.addition();
}
}