import java.util.*;

class reversearray
{
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
	 int arr[] = new int[10];
     int temp;

     System.out.println("Enter elements of array: ");
        
     for(int i =0;i<arr.length;++i)
     {
        arr[i] = sc.nextInt();
     }
     for(int i =0,j=arr.length-1;i<arr.length;++i,j--)
     {
        System.out.print(arr[j]+"\t");
     
     

     

	}
}
}