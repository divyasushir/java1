public class WrapperExample21
{
 public static void main(String args[])
 {
	 byte b=10;
	 short s=20;
	 int i=30;
	 long l=40;
	 float f=50.0F;
	 double d=60.0D;
	 char c='a';
	boolean b2=true;

//Autoboxing: Converting primitives into objects

Byte byteobj=b;
Short shortobj=s;
Integer intobj=i;
Long longobj=l;
Float floatobj=f;
Double doubleobj=d;
Character charobj=c;
Boolean boolobj=b2;

//printing objects

System.out.println("printing object values");
System.out.println("Byte object: "+ byteobj);
System.out.println("Short object:"+shortobj);
System.out.println("Interger object: "+intobj);
System.out.println("long object :"+longobj);
System.out.println("Float object :"+floatobj);
System.out.println("Double object :"+doubleobj);
System.out.println("Character object :"+charobj);
System.out.println("Boolean object :"+boolobj);

//unboxing : converting objects to primitives

byte bytevalue=byteobj;
short shortvalue=shortobj;
int intvalue=intobj;
long longvalue=longobj;
float floatvalue=floatobj;
double doublevalue=doubleobj;
char charvalue=charobj;
boolean boolvalue=boolobj;

//printing primitives

System.out.println("printing object values");
System.out.println("Byte object: "+ bytevalue);
System.out.println("Short object:"+shortvalue);
System.out.println("Interger object: "+intvalue);
System.out.println("long object :"+longvalue);
System.out.println("Float object :"+floatvalue);
System.out.println("Double object :"+doublevalue);
System.out.println("Character object :"+charvalue);
System.out.println("Boolean object :"+boolvalue);
 }
}