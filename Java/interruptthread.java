class Mythread extends Thread{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;++i)
		
		{

			System.out.println("Child thread");
			Thread.sleep(1000);
			}
		}
			catch (InterruptedException is){
				System.out.println("InterruptedException is occur");
			

}
}
}

class threadinterrupt
{
	public static void main(String args[]) throws InterruptedException
{
	Mythread t=new Mythread();
	t.start();
	t.interrupt();
	for(int i=1;i<=10;++i)
		{

			System.out.println("Main thread");
			Thread.sleep(1000);
		}
	}
}
