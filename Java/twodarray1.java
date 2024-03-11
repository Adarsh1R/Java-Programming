import java.util.Scanner;
class twodarray1
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int arr[][]=new int[3][3];
	int sum[][]=new int[3][3];
	int arr1[][]=new int[3][3];
	System.out.println("Enter array elements :");
	for(int i=0;i<3;++i)
	{
	for(int j=0;j<3;++j)
	{
	arr[i][j]=sc.nextInt();
	}
	}
	System.out.println("Enter array elements :");
	for(int i=0;i<3;++i)
	{
	for(int j=0;j<3;++j)
	{
	arr1[i][j]=sc.nextInt();
	}
	}
	System.out.println("Sum of element are :");
	for( int i=0;i<3;++i)
	{
	for( int j=0;j<3;++j)
	{
		sum[i][j] = arr1[i][j]+arr[i][j];
	System.out.print(sum[i][j]+"\t");
	}
	System.out.println();
}





}
}