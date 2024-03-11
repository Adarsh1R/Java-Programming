
import java.util.*;

interface RBI{
    int rate =2;
}

abstract class BankAccount1
{
	Scanner sc=new Scanner(System.in);
	static double amount;
    static double balance,balance1;
	static int mobile,accountNumber;
	static String name;
	abstract void deposit();
	
	abstract void withdraw();

    BankAccount1(){
        balance=1000.0;
        balance1=1000.0;
    }
	
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
        System.out.println("<------------Details-------------->");
		System.out.println("Account Number :"+ accountNumber);
		System.out.println("Name :"+ name);
		System.out.println("Mobile Number :"+ mobile);
		System.out.println("Balance for Current Account:"+balance1);
		System.out.println("Balance for Savings account:"+balance);
        System.out.println("-------------------------------------");

	}
}




class SavingsAccount1 extends BankAccount1 implements RBI
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
        if(balance-amount<1000)
		{
			System.out.println("Minimum account balance should be 1000");
		}
		else 
		{
			System.out.println("Withdrawal is possible");
			balance=balance-amount;	
		}
		balance=balance-amount;
	}

}


class Intrestman extends  SavingsAccount1 implements  RBI {
    int saRate =4 ;
    public void calculateInterest() {
        if(saRate>=rate){
            double money = BankAccountEx1.balance;
            System.out.println("The interest rate on your balance will be : " +money*(saRate/10) );
        }
    }
}


class CurrentAccount1 extends SavingsAccount1 implements RBI
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
        if(balance-amount<1000)
		{
			System.out.println("Minimum account balance should be 1000");
		}
		else {
		
			System.out.println("Withdrawal is possible");
			balance=balance-amount;	
		}
		balance1=balance1-amount;
	}

}

class Intrestman2 extends  CurrentAccount1 implements  RBI {
    int saRate =2 ;
    public void calculateInterest() {
        if(saRate>=rate){
            double money = BankAccountEx1.balance;
            System.out.println("The interest rate on your balance will be : " +money*(saRate/10) );
        }
    }
}



class BankingSystem3 extends CurrentAccount1
{
	public static void main(String args[])
	{
		while(true)
		{
			{
				CurrentAccount1 C=new CurrentAccount1();
				SavingsAccount1 S= new SavingsAccount1();
                Intrestman k = new Intrestman();
                Intrestman2 l = new Intrestman2();
				Scanner sc1=new Scanner(System.in);
				System.out.println("1. Input Data ");
				System.out.println("2. Show info ");
				System.out.println("3. Deposit amount on savings account ");
				System.out.println("4. Withdraw money from savings account ");
                System.out.println("5. Interest");
				System.out.println("6. Deposit money on current account");
				System.out.println("7. Withdraw money from current account");
                System.out.println("8. Interest");

				System.out.println("9.Exit ");
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
                case 5 : k.calculateInterest();
                        break;
				case 6: C.deposit();
						break;
                case 7: C.withdraw();
					    break;
                case 8: l.calculateInterest();
                        break;
                case 9:System.exit(0);
                        break;
			    default: System.exit(0);
					    break;
		    
		    

				}

			}
		}
	}
		}