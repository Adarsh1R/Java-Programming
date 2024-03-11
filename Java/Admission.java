import java.util.Scanner;
class Admission
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
    int per=(total/3)*100;
    System.out.println("Enter gender(f/m):");
	char gender=sc.next().charAt(0);
    if(per>=62 && gender=='f')
    {
    System.out.println("She can take admission");

    }
    else
    {
    System.out.println("She can not take admission");
    }
	}
}