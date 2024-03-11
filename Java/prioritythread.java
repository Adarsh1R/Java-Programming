class Threademo extends Thread{
	public void run()
	{
		System.out.println("Inside run method");
		}
		public static void main(String[] args) {
			Threademo t1=new Threademo();
			Threademo t2=new Threademo();
			Threademo t3=new Threademo();
			System.out.println("Thread t1:"+t1.getPriority());
			System.out.println("Thread t2:"+t2.getPriority());
			System.out.println("Thread t3:"+t3.getPriority());
			t1.setPriority(2);
			t2.setPriority(5);
			t3.setPriority(8);
			System.out.println("Thread t1:"+t1.getPriority());
			System.out.println("Thread t2:"+t2.getPriority());
			System.out.println("Thread t3:"+t3.getPriority());



		}
	}