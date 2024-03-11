class Batting
{
	public static synchronized void print(String name)
	{
		for(int i=1;i<=10;++i)
		{
			System.out.println("Batting :"+name);
		}
		try 
		{
			Thread.sleep(500);
		}
		catch(InterruptedException is)
		{
			is.printStackTrace();
		}
	}
}
class Mythread extends Thread
{
	public void run()
	{
		Batting.print("Sachin");
	}
}
class Mythread1 extends Thread
{
	public void run()
	{
		Batting.print("Virat");
	}
}
class Mythread2 extends Thread
{
	public void run()
	{
		Batting.print("Rohit");
	}
}
class ThreadDemo
{
	public static void main (String args[])
	{
		new Mythread().start();
		new Mythread1().start();
		new Mythread2().start();

	}
	}

