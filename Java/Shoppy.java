import java.util.*;

public class Shoppy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shopper obj = new Shopper();
        while (true) {
            System.out.println("WELCOME TO Shopping cart");
            System.out.println("1. Add a product? ");
            System.out.println("2. Show your shopping cart with price? !!");
            System.out.println("3. Delete anything from the cart? ");
            System.out.println("4. Update this cart item? ");
            System.out.println("5. Order this shit? ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    obj.addItems();
                    break;
                case 2:
                    obj.ShowAll();
                    break;
                case 3:
                    obj.deleteItems();
                    break;
                case 4:
                    obj.updateItems();
                    break;
                case 5:
                    obj.order();
                case 6:
                    System.exit(0);
            }
        }

    }
}


class Shopper {
    Scanner sc = new Scanner(System.in);
    ArrayList ItemNo = new ArrayList(50);
    ArrayList ItemName = new ArrayList(50);
    ArrayList ItemPrice = new ArrayList(50);
    ArrayList ItemQuantity = new ArrayList(50);
    int i = 0;

    public void addItems() {

        System.out.println("Enter the following that you want to add");
        System.out.println("Enter Item Number: ");
        String in = sc.next();
        ItemNo.add(in);

        System.out.println("Enter Item Name: ");
        String in2 = sc.next();
        ItemName.add(in2);

        System.out.println("Enter Item Price: ");
        String in3 = sc.next();

        ItemPrice.add(in3);


        System.out.println("Enter Item Quantity: ");
        String in4 = sc.next();
        ItemQuantity.add(in4);


    }

    public void ShowAll() {
        System.out.println("Your cart item are : ");

        for (int j = 0; j < ItemNo.size(); ++j) {
            System.out.print("Item Number " + ItemNo.get(j) + "  ");
            System.out.print("Item Name " + ItemName.get(j)+ "  ");
            System.out.print("Item Price " + ItemPrice.get(j)+ "  ");
            System.out.print("Item Quaitity " + ItemQuantity.get(j)+ "  ");
            System.out.println(" ");
        }
    }

    public void deleteItems() {
        System.out.println("enter the one you want to remove: ");
        int n = sc.nextInt();
        ItemQuantity.remove(n - 1);
        ItemNo.remove(n - 1);
        ItemName.remove(n - 1);
        ItemPrice.remove(n - 1);

    }

    public void updateItems() {
        System.out.println("enter the one you want to update: ");
        int n = sc.nextInt();
        System.out.println("Enter Item Number: ");
        String in = sc.next();
        ItemNo.set(n,in);

        System.out.println("Enter Item Name: ");
        String in2 = sc.next();
        ItemName.set(n, in2);

        System.out.println("Enter Item Price: ");
        String in3 = sc.next();

        ItemPrice.set(n,in3);


        System.out.println("Enter Item Quantity: ");
        String in4 = sc.next();
        ItemQuantity.set(n,in4);


    }
    public void order(){
            System.out.println("your Shopping cart is : ");
        for (int j = 0; j < ItemNo.size(); ++j) {
            System.out.println("Your cart item " + (j+1) + " : ");
            System.out.print("Item Number " + ItemNo.get(j) + "  ");

            System.out.print("Item Name " + ItemName.get(j)+ "  ");
            System.out.print("Item Price " + ItemPrice.get(j)+ "  ");
            System.out.print("Item Quaitity " + ItemQuantity.get(j)+ "  ");
            System.out.println(" ");
        }

        System.out.println("Please type your address: ");
        String adss = sc.next();
        System.out.println("Items will be delivered to your location after 2 days at "+ adss);
     System.out.println("Thank you for shopping with us!");
    }

}