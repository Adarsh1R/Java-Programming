import java.util.*;
class notes
{
	public static void main(String args[])
	{
		int amt,range,n1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount :");
        amt=sc.nextInt();
        System.out.println("Enter range :");
        range=sc.nextInt();
        switch(range){
              case 2000:n1=amt/2000;
                        System.out.println("No of 2000 notes return :  " +" "+n1+"="+2000*n1);
                        amt=amt%2000;
              case 500:n1=amt/500; 
                        System.out.println("No of 500 notes return : " +" "+n1+"="+500*n1);
                        amt=amt%500;
              case 200:n1=amt/200;
                        System.out.println("No of 200 notes return"+n1+"="+200*n1);
                        amt=amt%200;          
                      }
              case 100:n1=amt/100;
                        System.out.println("No of 100 notes return"+n1+"="+100*n1);
                        amt=amt%100;
              case 50:n1=amt/50;
                        System.out.println("No of 50 notes return"+n1+"="+50*n1);
                        amt=amt%50; 
              case 20:n1=amt/20;
                        System.out.println("No of 20 notes return"+n1+"="+20*n1);
                        amt=amt%20;   
              case 10:n1=amt/10;
                        System.out.println("No of 10 notes return"+n1+"="+10*n1);
                        amt=amt%10; 
              case 5:n1=amt/5;
                        System.out.println("No of 5 notes return"+n1+"="+5*n1);
                        amt=amt%5;   
              case 2:n1=amt/2;
                        System.out.println("No of 2notes return"+n1+"="+2*n1);
                        amt=amt%2;  
              case 1:n1=amt/1;
                        System.out.println("No of 1 notes return"+n1+"="+1*n1);
                        amt=amt%1;                                                

	 


      }
}

