import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    int n1,n2,n3,n4,n5;
    int min;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter values of n1,n2,n3,n4,n5");
    n1=sc.nextInt();
    n2=sc.nextInt();
    n3=sc.nextInt();
    n4=sc.nextInt();
    n5=sc.nextInt();
    min=n1;
    if(min>n2)
    {
        min=n2;
    }
    if(min>n3)
    {
        min=n3;

    }
    if(min>n4)
    {
        min=n4;

    }
    if(min>n5)
    {
        min=n5;
    }
    else{
    System.out.println("Min is " +min);
    }
}
}