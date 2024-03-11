class static1
{
	static int num=staticMethod();

static
{
	System.out.println("Static block");
}
 static int staticMethod()
 {
 	System.out.println("from static method");
 	return 40;
 }



public static void main(String args[])
{
	System.out.println("Main block");
	System.out.println("Num :"+num);
}
}