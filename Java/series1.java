import java.util.*;

class series1{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);

	  int x,n,s,fact=1;
	  double sum=1;
	  System.out.print("Enter the value of n: ");
	  n = sc.nextInt();
	  System.out.print("Enter the value of x: ");
	  x = sc.nextInt();

	  for(int i=1;i<=n;i++)
	  {
	  

	  		fact=fact*i;
	        sum = sum+ (Math.pow(x,i)/fact);
	        
	  	
	  }
      System.out.print("sum of the series is :"+sum); 

	}
}