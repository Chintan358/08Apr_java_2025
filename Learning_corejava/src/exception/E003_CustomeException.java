package exception;

class InsufficientFundExeception extends RuntimeException
{
	double amount;
	public InsufficientFundExeception(double need) {
		amount = need;
	}
	
	public void getmessage()
	{
		System.out.println("you are sort of : "+amount);
	}
}

class Bank
{
	double balance;
	
	public void checkBalance()
	{
		System.out.println("Current balance is : "+balance);
	}
	
	public void deposite(double amount)
	{
		balance+=amount;
	}
	
	public void withdrow(double amount) throws InsufficientFundExeception //prapogate exception , with mathod name, follwed by class name
	{
		if(amount>balance)
		{
			
			throw new InsufficientFundExeception(amount-balance);
			//generate exeprion
			//inside method body
			//followed by class object
		}
		else
		{
			balance-=amount;
		}
	}
}

public class E003_CustomeException {
	public static void main(String[] args) {
		
		Bank b  =new Bank();
		b.checkBalance();
		
		b.deposite(5000);
		b.deposite(3000);
		
		b.checkBalance();
		
		try {
			b.withdrow(20000);
		} catch (InsufficientFundExeception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getmessage();
		}
		//b.withdrow(50000);
		b.checkBalance();
	}
}
