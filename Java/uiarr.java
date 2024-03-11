import java.util.*;

class uiarr
{
	public static void main(String args[])
	{
	  int arr[] = new int[5];
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter elements of array: ");
      for(int i=0;i<5;++i)
      {
        arr[i] = sc.nextInt();
      }
      System.out.print("array data are: ");
      for(int i=0;i<5;++i)
      {
        System.out.println(arr[i]);
      }


	}
}