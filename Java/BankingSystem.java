import java.util.*;
class BankAccount
{
	Scanner sc=new Scanner(System.in);
	
	int accountNumber,deposit,amount;
	int mobile;
	String name;
	static int balance;
	public void inputData()
	{
		System.out.println("Enter Account Number :");
		accountNumber=sc.nextInt();
		System.out.println("Enter Name :");
		name=sc.next();
		System.out.println("Enter Mobile number :");
		mobile=sc.nextInt();

	}
	public BankAccount()
	{
		balance=1000;
	}
	public void display()
	{
		System.out.println("Account Number :"+ accountNumber);
		System.out.println("Name :"+ name);
		System.out.println("Mobile Number :"+ mobile);
		System.out.println("Balance:"+balance);

	}
	public void deposit()
	{
		System.out.println("Enter amount");
		amount=sc.nextInt();
		balance=balance+amount;
		
	}
	public void withdraw()
	{
		System.out.println("Enter amount :");
		amount=sc.nextInt();
		balance=balance-amount;
		
	}
}	
	class SavingsAccount extends BankAccount
	{
		public void withdraw()
	{
		System.out.println("Enter amount :");
		amount=sc.nextInt();
		
		
		
		if(balance-amount<1000)
		{
			
			System.out.println("Minimum account balance should be 1000");
		}
		else 
		{
			

			
			System.out.println("Withdrawal is possible");
			balance=balance-amount;
		}
	}
	}
	class BankingSystem
	{
		public static void main(String[] args)
		{


			Scanner sc=new Scanner(System.in);
			BankAccount B = new BankAccount();
			SavingsAccount S = new SavingsAccount();
			while(true)
			{
				System.out.println("1. Input Data ");
				System.out.println("2. Show info ");
				System.out.println("3. Deposit amount ");
				System.out.println("4. Withdraw money from bank ");
				System.out.println("5. Savings Account Withdrawal");
				System.out.println("6.Exit ");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1: B.inputData();
					    break;
			    case 2: B.display();
					    break;
                case 3: B.deposit();
					    break;
                case 4: B.withdraw();
					    break;
                case 5: S.withdraw();
					    break;
			    default: System.exit(0);
					    break;
		    
		    

				}

			}
		}
	}