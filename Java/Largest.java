import java.util.Scanner;
public class Main
{
    public static void main(String args[]){
    int n1,n2,n3,n4,n5;
    int max;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter values of n1,n2,n3,n4,n5 :");
    n1=sc.nextInt();
    n2=sc.nextInt();
    n3=sc.nextInt();
    n4=sc.nextInt();
    n5=sc.nextInt();
    max=n1;
    if(max<n2)
    {
        max=n2;
    }
    if(max<n3)
    {
        max=n3;

    }
    if(max<n4)
    {
        max=n4;

    }
    if(max<n5)
    {
        max=n5;
        System.out.println(max);
    }
    else {
    System.out.println("Max is"+n5);
    }
}
}