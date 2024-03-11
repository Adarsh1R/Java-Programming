import java.util.*;
class Test
{
	int itemNo,price;
	String name;
	ArrayList <Integer> i=new ArrayList<>();
	ArrayList <Integer> p=new ArrayList<>();
	ArrayList <String> n=new ArrayList<>();
	public void addItems()
	{
		
		System.out.println("Enter item no :");
		int it=sc.nextInt();
		itemNo.add(it);
		System.out.println("Enter item name :");
		int in=sc.next();
		name.add(in);
		System.out.println("Enter Price :");
		int pr=sc.nextInt();
		price.add(pr);


	}
	public void  showAllItems()
	{
		System.out.println("Size of the array list :"+itemNo.size());
		for(int i=0;i<itemNo.size;++i)
		{
			System.out.println("Item no :"+itemNo.get(i).toString()+"\t"+"Item name :"+name.get(i).toString()+"\t"+"Price :"+price.get(i).toString());
		}
	}
}
	class ShoppingCart
	{
		public static void main(String[] args) {
			
		
		Scanner sc=new Scanner(System.in);
		Test t=new Test();
		while(true)
		{
			System.out.println("Enter 1 .For Adding items");
			System.out.println("Enter 2. For Showing items");
			System.out.println("Enter 3. For Deleting items");
			System.out.println("Enter 4. For Updating items");
			System.out.println("Enter 5. For order");
			System.out.println("Enter 6. Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: t.addItems();
					break;
			case 2: t.showAllItems();
					break;

			}

		}
	}
}

