import java.util.Scanner;
class NOD{
	public static void main(String args[]){
	 int no,count=0;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number: ");
	 no = sc.nextInt();
	 while(no>0){
	 no = no/10;
	 ++count;
	 }
	 System.out.println("number of digit is : "+count);  
	}
}