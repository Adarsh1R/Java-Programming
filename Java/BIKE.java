class parent
{
	int cash=3000,gold;
	public void properties(){
       System.out.println("properties");
	}
	public void bike(){
	   System.out.println("Splender+");
	}
}

class child extends parent{
	  int cash=4000;
	  public void bike(){

	     System.out.println("Royal enfield, kawasaki ninja ");
	     System.out.println(cash);
	  }
}

class bike1{
      public static void main(String args[])
      {
         child c = new child();
         c.properties();
         c.bike();
      }
	
}