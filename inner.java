//java program to demonstrate nested class 1 helper classes
class outer
{
 //class 1
 // show() method of inner class

 class inner
 {
   public void show()
   {
   //print statement
   System.out.println("in a nested class method");
   }
 }
}
//class2 main class
class inner
{
public static void main(String args[])
{
//note how inner class object is created inside main()
outer.inner in=new outer().new inner();

//calling show() methoid over above object created
in.show();
}
}