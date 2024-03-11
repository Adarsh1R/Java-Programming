class A{
	 public A(){
	  System.out.println("Class A constructor");
	 }
	 public void showA(){
	  System.out.println("Class A show");
	 }

};
class B extends A{
	 public B(){
	  System.out.println("Class B constructor");
	 }
	 public void showB(){
	  System.out.println("Class B show");
	 }

};
class Test{
	 public static void main(String args[])
	 {
	    B obj=new B();
	    obj.showB();
	 } 
}
