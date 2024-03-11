import java.util.*;
abstract class BankAccount
{
	Scanner sc=new Scanner(System.in);
	static int amount,balance,balance1;
	static int mobile,accountNumber;
	static String name;
	abstract void deposit();
	
	abstract void withdraw();
	
	public void inputCustData()
	{
		System.out.println("Enter Account Number :");
		accountNumber=sc.nextInt();
		System.out.println("Enter Name :");
		name=sc.next();
		System.out.println("Enter Mobile number :");
		mobile=sc.nextInt();
	}
	public void showCustData()
	{
		System.out.println("Account Number :"+ accountNumber);
		System.out.println("Name :"+ name);
		System.out.println("Mobile Number :"+ mobile);
		System.out.println("Balance for Current Account:"+balance1);
		System.out.println("Balance for Savings account:"+balance);

	}
}
class SavingsAccount extends BankAccount
{
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
		if(0<1000)
		{
			
			System.out.println("Minimum account balance should be 1000");
		}
		else 
		{
			

			
			System.out.println("Withdrawal is possible");
			
		}
	}
}
class CurrentAccount extends SavingsAccount
{
	public void deposit()
	{
		System.out.println("Enter amount");
		amount=sc.nextInt();
		balance1=balance1+amount;
}
	public void withdraw()
	{
		System.out.println("Enter amount :");
		amount=sc.nextInt();
		balance1=balance1-amount;
		if(0<1000)
		{
			
			System.out.println("Minimum account balance should be 1000");
		}
		else 
		{
			

			
			System.out.println("Withdrawal is possible");
			
		}
	}
}

class MainAccount extends CurrentAccount
{
	public static void main(String args[])
	{
		while(true)
		{
			{
				CurrentAccount C=new CurrentAccount();
				SavingsAccount S= new SavingsAccount();
				Scanner sc1=new Scanner(System.in);
				System.out.println("1. Input Data ");
				System.out.println("2. Show info ");
				System.out.println("3. Deposit amount from savings account ");
				System.out.println("4. Withdraw money from savings account ");
				System.out.println("5. Deposit money to current account");
				System.out.println("6. Withdraw money from current account");

				System.out.println("7.Exit ");
				int choice=sc1.nextInt();
				switch(choice)
				{
				case 1: S.inputCustData();
					    break;
			    case 2: S.showCustData();
					    break;
                case 3: S.deposit();
					    break;
                case 4: S.withdraw();
					    break;
				case 5: C.deposit();
						break;
                case 6: C.withdraw();
					    break;
			    default: System.exit(0);
					    break;
		    
		    

				}

			}
		}
	}
		}
	