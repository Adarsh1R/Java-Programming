class rahul
{
	int a;
	int b;
	public rahul(int a, int b)
	{
	    this.a=a;
	    this.b=b;
	}

	void display()
	{
	     System.out.println("a = "+a+"b = "+b);
	}
}
class Saman
	{

	public static void main(String args[])
	{
	     rahul object = new rahul(40,80);
	     object.display();
	}
}