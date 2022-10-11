interface demo1
{
    void show();
}
class read1{

    int a,b;
    void read()
    {
        a=10;
        b=20;
    }
}
class mathimaticaloperation extends read1 implements demo1 
{
    public void show()
    {
        System.out.println("addition is="+ (a+b));
        
        
    }
}

public class multipleinher {
    
     public static void main(String[] args) {
        mathimaticaloperation m1=new mathimaticaloperation();
        m1.read();
        m1.show();
    } 
}
