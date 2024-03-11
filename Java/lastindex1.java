import java.util.*;

class lastindex1
{
   public static void main(String args[])
   {
     String str = "BABULAL";
     int i = str.lastIndexOf('B');
     int j = str.lastIndexOf('L');
     
     int k = str.lastIndexOf('A');
     System.out.println(i);
     System.out.println("last index of L is: "+j);
     
     System.out.println("last index of A is: "+k);
     System.out.println( str.lastIndexOf("P"));
     

     

   }
}