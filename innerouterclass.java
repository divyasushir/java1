//java program to demonstrate nested class insid method
class outer
{
 void outermethod()
 {
   System.out.println("inside outer mehtod");
   class Inner
   {
      public void innermethod()
      {
                 //print statement
                 System.out.println("Inside inner method");
      }
   }
   Inner y=new Inner();
   y.innermethod();
 }
}

//class 2 Main class
class innerouterclass
{
 public static void main(String args[])
 {
   //note how inner class object is created inside main()
   outer x=new outer();

   //calling show() method over above object created
   x.outermethod();
 }
}