import java.util.*;
class distance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String s=sc.next();
		System.out.println("Enter a String :");
		String t=sc.next();
		char ch;
		int count=0;

		if (s.length()==t.length())
		{
			for(int i=0;i<s.length();++i)
			{
				if(s.charAt(i)!=t.charAt(i))
				
				{
					count++;
				}
				}
				System.out.println(count);
			}
		
		else if(s.length()>t.length())
		{
			
				System.out.println(s.length()-t.length());
			}
		else if(s.length()<t.length())
		{
			System.out.println(t.length()-s.length());
		}
		}
	}

		
		
