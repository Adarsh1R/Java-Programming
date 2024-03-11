import java.util.Scanner;
class Marks
{
	public static void main(String args[])
	{
	int m1,m2,m3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks of 3 subjects");
	m1=sc.nextInt();
	m2=sc.nextInt();
    m3=sc.nextInt();
    int total=m1+m2+m3;
    int avg=(total/3)*100;
    if(avg<45)
    {
    System.out.println("Fail");

    }
    else
    {
    System.out.println("Pass");
    }
	}
}