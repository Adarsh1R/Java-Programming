import java.util.*;
class Test
{
	public static void main(String args[])
	{
		Test t1=new Test();
		Test t2=new Test ();
		System.out.println(t1==t2);
		 String str1="Deep";
		String str2="Deep";
		System.out.println(str1==str2);
		String s1=new String("Ra");
		String s2=new String("Ra");
		System.out.println(s1==s2);
}
}