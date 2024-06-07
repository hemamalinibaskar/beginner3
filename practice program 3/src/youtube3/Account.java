package youtube3;
import java.util.*;

public class Account {
	static double Balance;
	static double amount;
	
	Account(double b,double a){
		Balance = b;
		amount = a;
		
	}
	
	Account(){
		
	}
	void withdrawal() {
		if(amount<Balance)
			System.out.println("Collect your Money");
		
			
	}
	
	
	void withdraw() throws InsufficientBalanceException {
		
		try {
		if(Balance< amount) 
			throw new InsufficientBalanceException(amount-Balance);
		}
		
		catch(InsufficientBalanceException e){
			System.out.println("Your Account has Insufficient Balance");
			
		}
		finally {
			System.out.println("Your Transaction is completed");
		}
	}
	
	public static void main(String args[]) throws InsufficientBalanceException {
		Balance =500;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the withdrawal amount: ");
		amount = sc.nextDouble();
		
		Account ac = new Account();
		
		ac.withdraw();
		ac.withdrawal();
		
		
	}
}
