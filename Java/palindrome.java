import java.util.Scanner;
class palindrome
{
	public static void main(String arg[])
	 {
	   int no,rem,rev=0,n;

	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number: ");
       no = sc.nextInt();
       n = no;
       while(no>0)
       {
          rem=no%10;
          rev=rev*10+rem;
          no=no/10;

       }
       if(n==rev)
       {
         System.out.println("It is a palindrome number.");
       }
       else
       {
         System.out.println("It is not a palindrome number.");
       }

	 }  

}