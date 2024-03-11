import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a=0;
	int b=1;
	int c;
	int n;
	System.out.print("Enter the range :");
	n=sc.nextInt();
	System.out.print(a+ "\t"+ b);
	for(int i=3;i<=n;++i)
	{
	c=a+b;
	System.out.print("\t"+c);
	a=b;
	b=c;
	}
	}
}