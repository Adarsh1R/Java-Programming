import java.util.Scanner;
class fact1
{
	public static void main(String args[])
	{
	  int fact=1,no;
	  System.out.println("Enter a number: ");
	  Scanner sc=new Scanner(System.in);
	  no = sc.nextInt();

	  while(no>0){
           fact = fact*no;
           --no;

	  }
	  System.out.println("factorial of the number is : "+fact);
	} 
}


