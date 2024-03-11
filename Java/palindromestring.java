import java.util.*;
class palindromestring
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String rev="";
		System.out.println("Enter a String : ");
		String s=sc.next();
		int l=s.length();
		for(int i=l-1;i>l;--i)
		{
			rev=rev+s.charAt(i);

		}
		if (s.equals(rev)) {
			
				System.out.println("String is palindrome");

			
		}
		else
		{
			System.out.println("String is not palindrome");
			}
		}
	}
