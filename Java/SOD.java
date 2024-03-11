import java.util.Scanner;
class SOD
{
	public static void main(String args[])
	{
	int no,sum=0,rem;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	no=sc.nextInt();
	while(no>0)
	{
	rem=no%10;
	sum=sum+rem;
	no=no/10;
	}
	System.out.println("Sum of digits are :"+sum);
	}
}