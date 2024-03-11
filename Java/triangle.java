import java.util.*;

class Triangle
{

	double s1,s2,s3,p,a,s;
	public Triangle()
	{
		s1=4;
		s2=5;
		s3=6;
	}
	public void area()
	{
		 s=(s1+s2+s3)/2;
		 a=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.println("Area:"+a);
	}
	public void perimeter()
	{
		 p = s1+s2+s3;
		System.out.println("perimeter is :"+p);
	}
}

class triangle1{
       public static void main(String[] args) {

       	Triangle t=new Triangle();
       	t.area();
       	t.perimeter();

       		
       	}	
	}	
  
