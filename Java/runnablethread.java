class Myjava implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;++i)
		{
			System.out.println("Child Thread");
		}
	}
	}
class Mainrunthread
{
	public static void main(String[] args) {
		Thread t=new Thread(new Thread());
		t.start();
		for(int i=1;i<=10;++i)
		{
			System.out.println("Main Thread");
		}
	}
	}
