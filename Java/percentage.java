import java.util.Scanner;

class percentage{
	public static void main(String[] args)
	  {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter marks of the student of 4 papers: ");
	    int m1,m2,m3,m4;
	    m1 = sc.nextInt();
	    m2 = sc.nextInt();
	    m3 = sc.nextInt();
	    m4 = sc.nextInt();

       int total = m1+m2+m3+m4;

       int per = (total/4)*100;

       if(per>=90)
       {
         System.out.println("Grade A");
       } 
       else if(per>=80 && per<90)
       {
         
         System.out.println("Grade B");
       }

       else if(per>=70 && per<80)
       {
         
         System.out.println("Grade C");
       }

       else if(per>=60 && per<70)
       {
         
         System.out.println("Grade D");
       }
       else
       {
         System.out.println("Grade E");
       }






	  } 
}