import java.util.*;
class LargeSmallSum	
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[7];
		int sum;
		int max=arr[0];
		int min=arr[0];
		System.out.println("Enter Array elements :");
		for(int i=0;i<7;++i)
		{
		int n=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;++i)
		{


		if(max<arr[i])
		{
			max=arr[i];
			System.out.println("Maximum number is:"+max);
		

	     if(min>arr[i])
	    {
		 min =arr[i];	

		}
		System.out.println("Maximum number is:"+max);
		System.out.println("Minimum number is:"+min);

		sum=min+max;
		System.out.println("SUM : "+sum);
		}
		

	}
}