class threadyield extends Thread
{

	public void run()
	{
		for(int i=1;i<=10;++i)
		{

			System.out.println("Child thread");
			Thread.yield();

		
	
	}
}
}
class Demo
{
public static void main(String args[])
{
	threadyield t=new threadyield();
	t.start();
	for(int i=1;i<=10;++i)
		{

			System.out.println("Main thread");
		}
	}
}