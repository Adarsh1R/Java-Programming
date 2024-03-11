import java.util.*;
class Student
{
	int roll_no=120;
	String name="Ashish";
	public void showInfo()
	{
		System.out.println("Roll no :"+roll_no);
		System.out.println("Name :"+ name);
	}
	 public static void main(String[] args)
	 {
		Student s=new Student();
		s.showInfo();
	}
}