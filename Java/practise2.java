import java.util.*;
class practise2
{
	public static void main(String args[])
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s=sc.next();
		char[] ch=s.toCharArray();
		if(s.length()==32)
		{
			System.out.println("String is of 32 bits");

		}
		else
		{
			System.out.println("String is not of 32 bits");
		}
		for(int i=0;i<s.length();++i)
		{
			if(ch[i]=='1')
			{
				count++;
			}
		}
		System.out.println("No of 1s are :"+ count);

		}

	}
