import java.util.*;
class Practise
{
	static int n;
	
		void isGreaterThan()
		{
		 
		 int sum=1;
		 int y=0;
		 for(int i=0;i<n;++i)
		 {
		 	sum=sum*4;
		 	if(sum==n)
		 	{
		 		System.out.println("True");

		 	}
		 	else
		 	{
		 		y++;
		 	}

		 	}
		 	if(y==n)
		 	{
		 		System.out.println("False");
		 	}
		 }
         
		
		public static void main(String args[])
		{
			Practise p=new Practise();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number :");
			n=sc.nextInt();
			p.isGreaterThan();
		}
	}
	
