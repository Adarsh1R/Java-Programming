import java.util.Scanner;
class reverseofanumber
{
	public static void main(String arg[])
	 {
	   int no,rem,rev=0;
	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number: ");
       no = sc.nextInt();
       while(no>0)
       {
          rem=no%10;
          rev=rev*10+rem;
          no=no/10;

       }
       System.out.println("Reverse of a number is "+rev);      
	 }

}