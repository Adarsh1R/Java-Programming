import java.util.*;
class Pattern4
{
	public static void main(String args[])
	{
	int count=1;
	for(int i=1;i<=16;i++)
	{
	for(int j=1;j<i;j++)
	{
		System.out.print(i);
		++count;
	    }
	    System.out.println();
	}
}
}