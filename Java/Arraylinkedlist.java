import java.util.*;

class ArrayListDemo
{ 
	public static void main(String[] args) 
	{
		ArrayList<String> test=new ArrayList<>(4);
		test.add("White");
		test.add("Black");
		test.add("Red");
		test.add("Blue");
		System.out.println("*******************Color List******************");
		for(int i=0;i<4;++i)
		{
			System.out.println(test.get(i).toString());
		}
      ArrayList<String> sample=new ArrayList<>(3);
      sample.add("Green");
      sample.add("Pink");
      sample.add("Orange");
      test.addAll(sample);
      System.out.println("New size of the Array is:"+test.size());
      for(int i=0;i<test.size();++i)
      {
      	System.out.println(test.get(i).toString());
      }
	}
} 