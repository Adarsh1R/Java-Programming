import java.util.*;

class bad1
{
	static int n;
	static int bad;
	 public void isBadVersion()
	{
		while(n>0)
		{
			if(bad>n)
			{
				System.out.println(n+" Version is False");
			}
			else
			{
				System.out.println(n+" Version is True");
			}
			n--;
		}
	}

			
		
	
	public static void main(String args[])
	{
		bad1 b=new bad1();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter version number :");
		n=sc.nextInt();
		System.out.println("Enter bad version number :");
		bad=sc.nextInt();
		b.isBadVersion();
	}
}




	