import java.util.Scanner;
class Abc
{
    public static void main(String args[])
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        age=sc.nextInt();
        if(age>18)
        {
            System.out.println("Eligible for vote");

        }
        else
        {
            System.out.println("Not eligible for vote");
            
        }
    }
}
