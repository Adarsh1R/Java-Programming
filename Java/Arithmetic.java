import java.util.*;
class Arithmetic
{
	public static void main(String args[])
	{


	  Scanner sc = new Scanner(System.in);
	  while(true){
	    System.out.println("Enter any two numbers: ");
	    int n1=sc.nextInt();
	    int n2=sc.nextInt();
	    System.out.println("1. Addition ");
	    System.out.println("2. Substraction ");
	    System.out.println("3. Multiplication");
	    System.out.println("4. Division");
	    System.out.println("5. Exit");
	    System.out.println("Select any choice: ");
	    int n=sc.nextInt();

	    switch(n) {
	         case 1: System.out.println("Addition is: " +(n1+n2));
	                 break;

	         case 2: System.out.println("Substraction is: " +(n1-n2));
	                 break;

	         case 3: System.out.println("Multiplication is: " +(n1*n2));
	                 break;

	         case 4: System.out.println("Division is: " +(n1/n2));
	                 break;   

	         case 5: System.exit(0);
	                 break;

	         default: System.out.println("invalid input");
	                 break;                 



          }
	  }
}
}
