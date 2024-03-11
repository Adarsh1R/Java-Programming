import java.util.Scanner;
class costprice
{
	public static void main(String args[])
	{
		double ds;
	  Scanner sc=new Scanner(System.in);
	  double nc;
	  System.out.println("Enter Cost Price");
	  double cp= sc.next();
	  System.out.println("Is the user a student (y/n) :");
	  char s=sc.next().charAt(0);
	  if(s=='y')
	  {
	     if(cp>=500)
	     {
          ds=0.1*cp;
	     }
	     else
	     {
  
          ds=0.5*cp;

	     }
	 }
	  else
	 {
	    if(cp>=500)
	    {
	       ds=0.8*cp;
	    }
	    else {
	     ds=0.2*cp;
	    }
	 }
	  nc=cp-ds;
	 
	 System.out.println("Cost price :"+cp);
	 System.out.println("Discount :"+ds);
	 System.out.println("Net cost price :"+nc);




	}
}