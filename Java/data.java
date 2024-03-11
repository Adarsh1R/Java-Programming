class Data
{
	int a,b;
	public Data()
	{
		this(10,20);
	}
		public Data(int x,int y)
		{
			a=x;
			b=y;
			this.show();
		}
		void show()
		{
			System.out.println("A:"+a);
			System.out.println("B:"+b);

		}
		
	}
		class Datatest
		{

			
		public static void main(String args[])
		{
			Data d=new Data();
			Data d1=new Data(100,200);

		}

		}
	
