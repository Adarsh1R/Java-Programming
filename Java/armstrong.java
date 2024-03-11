import java.util.Scanner;
class armstrong
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int no,sum=0,rem;
	int n;
	System.out.println("Enter a number");
	no=sc.nextInt();
	n=no;
	while(no>0)
	{
	rem=no%10;
	sum=sum+(rem*rem*rem);
	no=no/10;

	}
	if(n==sum)
	{
	System.out.println("It is a Armstrong no");
	}
	else
	{
	System.out.println("It is not a Armstrong no");
	}

	}
}