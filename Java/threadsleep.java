class threadsleep extends Thread
{

	public void run()
	{
		for(int i=1;i<=10;++i)
		{

			System.out.println("Child thread");
			try
			{
				Thread.sleep(100);

			}
			catch (InterruptedException is){}

			

			}
			}
		}
class Demo
{
public static void main(String args[]) throws InterruptedException
{
	threadsleep t=new threadsleep();
	t.start();
	t.join();
	for(int i=1;i<=10;++i)
		{

			System.out.println("Main thread");
		}
	}
}