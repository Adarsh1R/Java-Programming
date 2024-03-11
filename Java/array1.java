import java.util.*;
class array1
{
	public static void main(String args[])
	{
	int sum=0;
	int arr[]=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array elements");
	for(int i=0;i<10;++i)
	{
	arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;++i)
	{
	sum=sum+arr[i];
	}
	System.out.println("Sum = "+sum);
	}
}