interface demo
{
    void show();
}
class read{

    int a,b;
    void read1()
    {
        a=10;
        b=20;
    }
}
class mathimaticaloperation extends read implements demo 
{
   public void show()
    {
        System.out.println("addition is="+(a+b));
        System.out.println("Multiplication is="+a*b);
        System.out.println("Divisoin is="+a/b);
        
    }
}

public class multiplein {
    public static void main(String[] args) {
        mathimaticaloperation m1=new mathimaticaloperation();
        m1.read1();
        m1.show();
    } 
}
