abstract class test
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4()
	{
		System.out.println("This is abstraction");
	}
}
abstract class test1 extends test
{
	void m1()
	{
		System.out.println("m1 method");
	}
}
abstract class test2 extends test1{
	void m2()
	{
		System.out.println("m2 method");
	}
}

 class testmain extends test2
{
	void m3()
	{
		System.out.println("m3 method");

	}
	public static void main(String args[])
	{
		testmain t= new testmain();
		t.m1();
		t.m2();
		t.m3();
	}
} 	
