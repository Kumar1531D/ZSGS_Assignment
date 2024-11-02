package assignment_ExceptionHandling;

public class BankBalanceExceptionDemo {

	public static void main(String[] args) {
		
		Bank account = new Bank(20000);
		
		try {
			account.withdraw(10000);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}

class InsufficientBalanceException extends Exception{
	
	InsufficientBalanceException(String msg){
		super(msg);
	}
	
}

class Bank{
	
	private double balance;
	
	Bank(double balance){
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException {
		
		if(amount>balance) {
			throw new InsufficientBalanceException("Insufficient balance for withdrawl!");
		}
		else {
			balance-=amount;
			System.out.println("Successfully withdrawal. Remaining Balance : "+balance);
		}
		
	}
	
}