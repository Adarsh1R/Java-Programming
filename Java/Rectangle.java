import java.util.*;

class rectangle
{
	int length,breadth;
	
	public rectangle( int l,int b)
	{
		length=l;
		breadth=b;
		

	}
	

	int area()
	{
		return length*breadth;

	}
	
}
class Main
{
	public static void main(String[] args)
	{
		rectangle r=new rectangle(3,5);
		rectangle r1=new rectangle(4,6);
		System.out.println("Area of rectangle 1 is :"+r.area());
		System.out.println("Area of rectangle 2 is :"+r1.area());
	}
}