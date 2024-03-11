import java.util.Scanner;
class Leap
{
	public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in);
    int year;
    System.out.println("Enter a year");
    year=sc.nextInt();
    if(year/100!=0)
    {
    if(year%4==0)
    {
    System.out.println("Leap year");
    }
    else
    {
    System.out.println("Not a leap year");

    }
    }
    else
    {
    if(year%400==0)
    {
    System.out.println(" Century and Leap year");

    }
    else
    {
    System.out.println("Not a leap year");
    }
    }
    }
	}
