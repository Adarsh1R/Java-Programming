import java.util.*;

class dupelement
{
	public static void main(String args[])
	{
      	String[] strarray = {"Ashish","adarsh","saman","sameen","Ashish","rahul"};

      	for(int i=0;i<strarray.length-1;++i)
      	{
      	    for(int j=i+1;j<strarray.length;++j)
      	    {
               if((strarray[i]).equals(strarray[j]) && (i!=j))
               {
               	 System.out.println("Duplicate string:"+strarray[j]);
               }
      	    }
      	}
	}
}