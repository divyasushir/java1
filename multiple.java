interface demo
{ 
    void read();

}
interface demo_2 extends demo
{
void read2();
}
class demo_3 implements demo_2
{
    void get()
    {
        System.out.println("Where do you live?");

    }

public void read()
{
System.out.println("I live in taloda");
}
public void read2()
{
System.out.println("Near bus stand,chinoda road taloda ");
}
}
public class multiple {
    public static void main(String args[]) 
    {
        demo_3 d1=new demo_3();
        d1.get();
        d1.read();
        d1.read2();
    }
}
